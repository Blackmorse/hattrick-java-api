package com.blackmorse.hattrick.api.matches.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HomeTeam {
    @JacksonXmlProperty(localName = "HomeTeamID")
    private Long homeTeamId;
    @JacksonXmlProperty(localName = "HomeTeamName")
    private String homeTeamName;
    @JacksonXmlProperty(localName = "HomeTeamNameShortName")
    private String homeTeamNameShortName;

    public Long getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Long homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamNameShortName() {
        return homeTeamNameShortName;
    }

    public void setHomeTeamNameShortName(String homeTeamNameShortName) {
        this.homeTeamNameShortName = homeTeamNameShortName;
    }
}
