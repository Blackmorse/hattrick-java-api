package com.blackmorse.hattrick.api.players;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.players.model.Players;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class PlayersExecutor extends ApiExecutor<PlayersExecutor, Players> {
    public PlayersExecutor(OAuthService service, Token token) {
        super(service, token, "players", "2.4", Players.class);
    }

    public PlayersExecutor actionType(String actionType) {
        return addParameter("actionType", actionType);
    }

    public PlayersExecutor orderBy(String orderBy) {
        return addParameter("orderBy", orderBy);
    }

    public PlayersExecutor teamID(long id) {
        return addParameter("teamID", id);
    }

    public PlayersExecutor includeMatchInfo(boolean flag) {
        return addParameter("includeMatchInfo", flag);
    }
}
