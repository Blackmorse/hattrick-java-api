package com.blackmorse.hattrick.api.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchParams {
    @JacksonXmlProperty(localName = "SearchType")
    private Integer searchType;
    @JacksonXmlProperty(localName = "SearchString")
    private String searchString;
    @JacksonXmlProperty(localName = "SearchString2")
    private String searchString2;
    @JacksonXmlProperty(localName = "SearchID")
    private Integer searchId;
    @JacksonXmlProperty(localName = "SearchLeagueID")
    private Integer searchLeagueId;

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchString2() {
        return searchString2;
    }

    public void setSearchString2(String searchString2) {
        this.searchString2 = searchString2;
    }

    public Integer getSearchId() {
        return searchId;
    }

    public void setSearchId(Integer searchId) {
        this.searchId = searchId;
    }

    public Integer getSearchLeagueId() {
        return searchLeagueId;
    }

    public void setSearchLeagueId(Integer searchLeagueId) {
        this.searchLeagueId = searchLeagueId;
    }
}
