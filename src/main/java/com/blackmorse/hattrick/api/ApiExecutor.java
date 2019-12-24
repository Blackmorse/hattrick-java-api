package com.blackmorse.hattrick.api;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import java.util.HashMap;
import java.util.Map;

abstract class ApiExecutor<T extends ApiExecutor> {
    private static final String CHPP_URL = "https://chpp.hattrick.org/chppxml.ashx";

    private final OAuthService service;
    private final Token token;
    private final String file;

    private final Map<String, String> parameters = new HashMap<>();

    protected ApiExecutor(OAuthService service, Token token, String file, String version) {
        this.service = service;
        this.token = token;
        this.file = file;
        parameters.put("version", version);
    }

    public T version(String version) {
        parameters.put("version", version);
        return (T) this;
    }

    protected void addParameter(String name, boolean value) {
        parameters.put(name, value ? "true" : "false");
    }

    protected void addParameter(String name, int value) {
        parameters.put(name, String.valueOf(value));
    }

    public void execute() {
        OAuthRequest request = new OAuthRequest(Verb.GET, CHPP_URL + "?file=" + file);

        service.signRequest(token, request);

        Response response = request.send();
    }
}
