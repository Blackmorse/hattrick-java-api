package com.blackmorse.hattrick.api.matchdetails;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.matchdetails.model.MatchDetails;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class MatchDetailsExecutor extends ApiExecutor<MatchDetailsExecutor, MatchDetails> {
    public MatchDetailsExecutor(OAuthService service, Token token) {
        super(service, token, "matchdetails", "3.0", MatchDetails.class);
    }


}
