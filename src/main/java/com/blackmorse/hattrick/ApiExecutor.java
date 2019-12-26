package com.blackmorse.hattrick;

import com.blackmorse.hattrick.api.Model;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class ApiExecutor<T extends ApiExecutor, V extends Model> {
    private static final String CHPP_URL = "https://chpp.hattrick.org/chppxml.ashx";

    private final OAuthService service;
    private final Token token;
    private final String file;
    private final Class<V> responseClass;

    private final Map<String, String> parameters = new HashMap<>();
    private final ObjectMapper objectMapper;

    protected ApiExecutor(OAuthService service, Token token, String file, String version, Class<V> responseClass) {
        this.service = service;
        this.token = token;
        this.file = file;
        this.responseClass = responseClass;
        parameters.put("version", version);

        objectMapper = new XmlMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }

    public T version(String version) {
        parameters.put("version", version);
        return (T) this;
    }

    protected T addParameter(String name, boolean value) {
        parameters.put(name, value ? "true" : "false");
        return (T) this;
    }

    protected T addParameter(String name, int value) {
        parameters.put(name, String.valueOf(value));
        return (T) this;
    }

    protected T addParameter(String name, String value) {
        parameters.put(name, value);
        return (T) this;
    }

    public V execute() {
        String params = parameters.entrySet()
                .stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));

        OAuthRequest request = new OAuthRequest(Verb.GET, CHPP_URL + "?file=" + file + "&" + params);

        service.signRequest(token, request);

        Response response = request.send();
        String responseBody = preprocessBody(response.getBody());
        try {
            return objectMapper.readValue(responseBody, responseClass);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    protected String preprocessBody(String body) {
        return body;
    }
}
