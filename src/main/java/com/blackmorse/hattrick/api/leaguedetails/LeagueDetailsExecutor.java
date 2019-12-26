package com.blackmorse.hattrick.api.leaguedetails;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.leaguedetails.model.LeagueDetails;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class LeagueDetailsExecutor extends ApiExecutor<LeagueDetailsExecutor, LeagueDetails> {
    public LeagueDetailsExecutor(OAuthService service, Token token) {
        super(service, token, "leaguedetails", "1.5", LeagueDetails.class);
    }

    @Override
    protected String preprocessBody(String body) {
        //Workaround: <Team> elements has no parent elements
        int firstIndex = body.indexOf("<Team>");
        if (firstIndex != -1) {
            int lastIndex = body.lastIndexOf("</Team>");
            return body.substring(0, firstIndex) + "<Teams>" +
                    body.substring(firstIndex, lastIndex + 8) + "</Teams>"
                    + body.substring(lastIndex + 8);
        } else {
            return body;
        }
    }

    public LeagueDetailsExecutor leagueLevelUnitId(int id) {
        return addParameter("leagueLevelUnitID", id);
    }
}
