package com.blackmorse.hattrick.api.nationalteamdetails;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.nationalteamdetails.model.NationalTeamDetails;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class NationalTeamDetailsExecutor extends ApiExecutor<NationalTeamDetailsExecutor, NationalTeamDetails> {
    public NationalTeamDetailsExecutor(OAuthService service, Token token) {
        super(service, token, "nationalteamdetails", "1.9", NationalTeamDetails.class);
    }

    public NationalTeamDetailsExecutor teamId(int id) {
        addParameter("teamID", id);
        return this;
    }
}
