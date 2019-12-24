package com.blackmorse.hattrick.scribe;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.Token;
import org.scribe.model.Verb;

public class ScribeHattrickApi extends DefaultApi10a {
    @Override
    public String getAccessTokenEndpoint()
    {
        return "https://chpp.hattrick.org/oauth/access_token.ashx";
    }

    @Override
    public String getRequestTokenEndpoint()
    {
        return "https://chpp.hattrick.org/oauth/request_token.ashx";
    }

    @Override
    public String getAuthorizationUrl(Token token)
    {
        return "https://chpp.hattrick.org/oauth/authorize.aspx?oauth_token=" + token.getToken();
    }

    @Override
    public Verb getAccessTokenVerb()
    {
        return Verb.GET;
    }

    @Override
    public Verb getRequestTokenVerb()
    {
        return Verb.GET;
    }
}
