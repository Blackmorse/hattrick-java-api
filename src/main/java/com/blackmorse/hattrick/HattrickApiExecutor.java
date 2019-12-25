package com.blackmorse.hattrick;

import com.blackmorse.hattrick.api.nationalteams.NationalTeamsExecutor;
import com.blackmorse.hattrick.api.teamdetails.TeamDetailsExecutor;
import com.blackmorse.hattrick.scribe.ScribeHattrickApi;
import org.scribe.builder.ServiceBuilder;
import org.scribe.model.SignatureType;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class HattrickApiExecutor {
    private final Token accessToken;

    private final OAuthService oAuthService;

    public HattrickApiExecutor(String customerKey, String customerSecret,
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
}
