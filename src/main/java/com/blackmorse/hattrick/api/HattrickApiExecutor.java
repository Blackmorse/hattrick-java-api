package com.blackmorse.hattrick.api;

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

    public TeamDetails teamDetails() {
        return new TeamDetails(oAuthService, accessToken);
    }
}
