package com.blackmorse.hattrick.api.matchdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HomeTeam extends HomeAwayTeam {
    @JacksonXmlProperty(localName = "HomeTeamID")
    private Long homeTeamId;
    @JacksonXmlProperty(localName = "HomeTeamName")
    private String homeTeamName;
    @JacksonXmlProperty(localName = "HomeGoals")
    private Integer homeGoals;

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

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }
}
