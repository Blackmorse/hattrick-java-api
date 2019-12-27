package com.blackmorse.hattrick;

import com.blackmorse.hattrick.api.leaguedetails.LeagueDetailsExecutor;
import com.blackmorse.hattrick.api.matchdetails.MatchDetailsExecutor;
import com.blackmorse.hattrick.api.matches.MatchesExecutor;
import com.blackmorse.hattrick.api.nationalteamdetails.NationalTeamDetailsExecutor;
import com.blackmorse.hattrick.api.nationalteams.NationalTeamsExecutor;
import com.blackmorse.hattrick.api.search.SearchExecutor;
import com.blackmorse.hattrick.api.teamdetails.TeamDetailsExecutor;
import com.blackmorse.hattrick.scribe.ScribeHattrickApi;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.SignatureType;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class HattrickApi {
    private final Token accessToken;

    private final OAuthService oAuthService;

    public HattrickApi(String customerKey, String customerSecret,
                       String accessToken, String accessTokenSecret) {
        this.accessToken = new Token(accessToken, accessTokenSecret);

        this.oAuthService = new ServiceBuilder()
                .provider(ScribeHattrickApi.class)
                .apiKey(customerKey)
                .apiSecret(customerSecret)
                .signatureType(SignatureType.Header)
            .build();
    }

    public TeamDetailsExecutor teamDetails() {
        return new TeamDetailsExecutor(oAuthService, accessToken);
    }

    public NationalTeamsExecutor nationalTeams() {
        return new NationalTeamsExecutor(oAuthService, accessToken);
    }

    public NationalTeamDetailsExecutor nationalTeamDetails() {
        return new NationalTeamDetailsExecutor(oAuthService, accessToken);
    }

    public SearchExecutor search() {
        return new SearchExecutor(oAuthService, accessToken);
    }

    public LeagueDetailsExecutor leagueDetails() {
        return new LeagueDetailsExecutor(oAuthService, accessToken);
    }

    public MatchesExecutor matches() {
        return new MatchesExecutor(oAuthService, accessToken);
    }

    public MatchDetailsExecutor matchDetails() {
        return new MatchDetailsExecutor(oAuthService, accessToken);
    }
}
