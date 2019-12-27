package com.blackmorse.hattrick.api.matchesarchive;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.matchesarchive.model.MatchesArchive;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

import java.util.Date;

public class MatchesArchiveExecutor extends ApiExecutor<MatchesArchiveExecutor, MatchesArchive> {
    public MatchesArchiveExecutor(OAuthService service, Token token) {
        super(service, token, "matchesarchive", "1.4", MatchesArchive.class);
    }

    public MatchesArchiveExecutor teamId(Long id) {
        return addParameter("teamID", id);
    }

    public MatchesArchiveExecutor isYouth(boolean isYouth) {
        return addParameter("isYouth", isYouth);
    }

    public MatchesArchiveExecutor firstMatchDate(Date date) {
        return addParameter("FirstMatchDate", date);
    }

    public MatchesArchiveExecutor lastMatchDate(Date date) {
        return addParameter("LastMatchDate", date);
    }

    public MatchesArchiveExecutor season(Integer season) {
        return addParameter("season", season);
    }

    public MatchesArchiveExecutor includeHto(boolean flag) {
        return addParameter("includeHTO", flag);
    }
}
