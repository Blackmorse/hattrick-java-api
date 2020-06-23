package com.blackmorse.hattrick.api.search;

import com.blackmorse.hattrick.ApiExecutor;
import com.blackmorse.hattrick.api.search.model.Search;
import com.blackmorse.hattrick.model.enums.SearchType;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public class SearchExecutor extends ApiExecutor<SearchExecutor, Search> {
    public SearchExecutor(OAuthService service, Token token) {
        super(service, token, "search", "1.2", Search.class);
    }

    public SearchExecutor searchType(SearchType type) {
        return addParameter("searchType", type);
    }

    public SearchExecutor searchString(String searchString) {
        return addParameter("searchString", searchString);
    }

    public SearchExecutor searchString2(String searchString2) {
        return addParameter("searchString2", searchString2);
    }

    public SearchExecutor searchId(int id) {
        return addParameter("searchID", id);
    }

    public SearchExecutor searchLeagueId(int id) {
        return addParameter("searchLeagueID", id);
    }

    public SearchExecutor pageIndex(int index) {
        return addParameter("pageIndex", index);
    }
}
