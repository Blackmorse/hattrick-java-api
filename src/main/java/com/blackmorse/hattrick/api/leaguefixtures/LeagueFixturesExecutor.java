package com.blackmorse.hattrick.api.leaguefixtures;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.leaguefixtures.model.LeagueFixtures;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class LeagueFixturesExecutor extends ApiExecutor<LeagueFixturesExecutor, LeagueFixtures> {
    public LeagueFixturesExecutor(OAuthService service, Token token) {
        super(service, token, "leaguefixtures", "1.2", LeagueFixtures.class);
    }

    @Override
    protected String preprocessBody(String body) {
        //Workaround: <Match> elements has no parent elements
        int firstIndex = body.indexOf("<Match>");
        if (firstIndex != -1) {
            int lastIndex = body.lastIndexOf("</Match>");
            return body.substring(0, firstIndex) + "<Matches>" +
                    body.substring(firstIndex, lastIndex + 8) + "</Matches>"
                    + body.substring(lastIndex + 8);
        } else {
            return body;
        }
    }

    public LeagueFixturesExecutor leagueLevelUnitId(Long id) {
        return addParameter("leagueLevelUnitID", id);
    }

    public LeagueFixturesExecutor season(int season) {
        return addParameter("season", season);
    }
}
