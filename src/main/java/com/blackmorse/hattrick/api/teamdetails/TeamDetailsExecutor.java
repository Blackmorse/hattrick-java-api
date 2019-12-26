package com.blackmorse.hattrick.api.teamdetails;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.teamdetails.model.TeamDetails;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class TeamDetailsExecutor extends ApiExecutor<TeamDetailsExecutor, TeamDetails> {
    public TeamDetailsExecutor(OAuthService service, Token token) {
        super(service, token, "teamdetails", "3.4", TeamDetails.class);
    }

    public TeamDetailsExecutor teamID(int id) {
        addParameter("teamID", id);
        return this;
    }

    public TeamDetailsExecutor userID(int id) {
        addParameter("userID", id);
        return this;
    }

    public TeamDetailsExecutor includeDomesticFlags(boolean flag) {
        addParameter("includeDomesticFlags", flag);
        return this;
    }

    public TeamDetailsExecutor includeFlags(boolean flag) {
        addParameter("includeFlags", flag);
        return this;
    }

    public TeamDetailsExecutor includeSupporters(boolean flag) {
        addParameter("includeSupporters", flag);
        return this;
    }
}
