package com.blackmorse.hattrick.api.matchlineup;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.matchlineup.model.MatchLineUp;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class MatchLineUpExecutor extends ApiExecutor<MatchLineUpExecutor, MatchLineUp> {
    public MatchLineUpExecutor(OAuthService service, Token token) {
        super(service, token, "matchlineup", "2.0", MatchLineUp.class);
    }

    public MatchLineUpExecutor matchId(Long id) {
        return addParameter("matchID", id);
    }

    public MatchLineUpExecutor teamId(Long id) {
        return addParameter("teamID", id);
    }

    public MatchLineUpExecutor sourceSystem(String system) {
        return addParameter("sourceSystem", system);
    }
}
