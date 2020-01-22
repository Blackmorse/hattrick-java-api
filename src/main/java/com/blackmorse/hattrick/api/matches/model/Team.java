package com.blackmorse.hattrick.api.matches.model;

import com.blackmorse.hattrick.model.common.League;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "TeamID")
    private Long teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "ShortTeamName")
    private String shortTeamName;
    @JacksonXmlProperty(localName = "League")
    private League league;
    @JacksonXmlProperty(localName = "LeagueLevelUnit")
    private LeagueLevelUnit leagueLevelUnit;
    @JacksonXmlProperty(localName = "MatchList")
    private List<Match> matchList;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getShortTeamName() {
        return shortTeamName;
    }

    public void setShortTeamName(String shortTeamName) {
        this.shortTeamName = shortTeamName;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public LeagueLevelUnit getLeagueLevelUnit() {
        return leagueLevelUnit;
    }

    public void setLeagueLevelUnit(LeagueLevelUnit leagueLevelUnit) {
        this.leagueLevelUnit = leagueLevelUnit;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }
}
