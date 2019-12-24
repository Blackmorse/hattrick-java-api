package com.blackmorse.hattrick.api;

import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

class TeamDetails extends ApiExecutor<TeamDetails> {
    protected TeamDetails(OAuthService service, Token token) {
        super(service, token, "teamdetails", "3.4");
    }

    public TeamDetails teamID(int id) {
        addParameter("teamID", id);
        return this;
    }

    public TeamDetails userID(int id) {
        addParameter("userID", id);
        return this;
    }

    public TeamDetails includeDomesticFlags(boolean flag) {
        addParameter("includeDomesticFlags", flag);
        return this;
    }

    public TeamDetails includeFlags(boolean flag) {
        addParameter("includeFlags", flag);
        return this;
    }

    public TeamDetails includeSupporters(boolean flag) {
        addParameter("includeSupporters", flag);
        return this;
    }
}
