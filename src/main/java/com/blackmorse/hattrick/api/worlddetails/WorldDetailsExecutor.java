package com.blackmorse.hattrick.api.worlddetails;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.worlddetails.model.WorldDetails;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class WorldDetailsExecutor extends ApiExecutor<WorldDetailsExecutor, WorldDetails> {
    public WorldDetailsExecutor(OAuthService service, Token token) {
        super(service, token, "worlddetails", "1.8", WorldDetails.class);
    }

    public WorldDetailsExecutor includeRegions(boolean flag) {
        return addParameter("includeRegions", flag);
    }

    public WorldDetailsExecutor countryId(int id) {
        return addParameter("countryID", id);
    }

    public WorldDetailsExecutor leagueId(int id) {
        return addParameter("leagueID", id);
    }
}
