package com.blackmorse.hattrick;

import com.blackmorse.hattrick.exceptions.HattrickChppException;
import com.blackmorse.hattrick.exceptions.HattrickTransferException;
import com.blackmorse.hattrick.model.ChppError;
import com.blackmorse.hattrick.model.Model;
import com.blackmorse.hattrick.model.enums.HattrickType;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public abstract class ApiExecutor<T extends ApiExecutor, V extends Model> {
    private static final String CHPP_URL = "https://chpp.hattrick.org/chppxml.ashx";

    private final OAuthService service;
    private final Token token;
    private final String file;
    private final Class<V> responseClass;

    private final Map<String, String> parameters = new HashMap<>();
    private final ObjectMapper objectMapper;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    protected ApiExecutor(OAuthService service, Token token, String file, String version, Class<V> responseClass) {
        this.service = service;
        this.token = token;
        this.file = file;
        this.responseClass = responseClass;
        parameters.put("version", version);

        objectMapper = new XmlMapper();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("CET"));
        objectMapper.setDateFormat(dateFormat);
    }

    public T version(String version) {
        parameters.put("version", version);
        return (T) this;
    }

    protected T addParameter(String name, boolean value) {
        parameters.put(name, value ? "true" : "false");
        return (T) this;
    }

    protected T addParameter(String name, Long value) {
        parameters.put(name, String.valueOf(value));
        return (T) this;
    }

    protected T addParameter(String name, int value) {
        parameters.put(name, String.valueOf(value));
        return (T) this;
    }

    protected T addParameter(String name, String value) {
        Charset utf8 = StandardCharsets.UTF_8;
        parameters.put(name, URLEncoder.encode(value, StandardCharsets.UTF_8));
        return (T) this;
    }

    protected T addParameter(String name, Date date) {
        parameters.put(name, dateFormat.format(date));
        return (T) this;
    }

    protected T addParameter(String name, HattrickType value) {
        parameters.put(name, String.valueOf(value.getValue()));
        return (T) this;
    }

    public V execute() {
        String params = parameters.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));

        OAuthRequest request = new OAuthRequest(Verb.GET, CHPP_URL + "?file=" + file + "&" + params);

        service.signRequest(token, request);

        Response response = null;
        try {
            response = request.send();
        } catch(Exception e) {
            throw new HattrickTransferException(e, params);
        }
        String responseBody = preprocessBody(response.getBody());
        try {
            //https://github.com/FasterXML/jackson-dataformat-xml/issues/124
            objectMapper.configOverride(List.class)
                    .setSetterInfo(JsonSetter.Value.forValueNulls(Nulls.AS_EMPTY));
            V model = objectMapper.readValue(responseBody, responseClass);
            if(model.getFileName().equals("chpperror.xml")) {
                ChppError chppError = objectMapper.readValue(responseBody, ChppError.class);
                throw new HattrickChppException(chppError);
            }
            return model;
        } catch (JsonProcessingException e) {
            throw new HattrickTransferException(e, params);
        }
    }

    protected String preprocessBody(String body) {
        return body;
    }
}
