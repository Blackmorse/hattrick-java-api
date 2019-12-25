package com.blackmorse.hattrick.api.nationalteams;

import com.blackmorse.hattrick.ApiExecutor;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class NationalTeamsExecutor extends ApiExecutor<NationalTeamsExecutor, NationalTeams> {
    public NationalTeamsExecutor(OAuthService service, Token token) {
        super(service, token, "nationalteams", "1.5", NationalTeams.class);
    }

    public NationalTeamsExecutor leagueOfficeTypeID(int id) {
        addParameter("LeagueOfficeTypeID", id);
        return this;
    }
}
