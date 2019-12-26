package com.blackmorse.hattrick.api.matches;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.matches.model.Matches;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

import java.util.Date;

public class MatchesExecutor extends ApiExecutor<MatchesExecutor, Matches> {
    public MatchesExecutor(OAuthService service, Token token) {
        super(service, token, "matches", "2.8", Matches.class);
    }

    public MatchesExecutor teamId(int id) {
        return addParameter("teamID", id);
    }

    public MatchesExecutor isYouth(boolean flag) {
        return addParameter("isYouth", flag);
    }

    public MatchesExecutor lastMatchDate(Date date) {
        return addParameter("LastMatchDate", date);
    }
}
