package com.blackmorse.hattrick.api.leaguedetails.model;

import com.blackmorse.hattrick.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueDetails extends Model {
    @JacksonXmlProperty(localName = "LeagueID")
    private Integer leagueId;
    @JacksonXmlProperty(localName = "LeagueName")
    private String leagueName;
    @JacksonXmlProperty(localName = "LeagueLevel")
    private Integer leagueLevel;
    @JacksonXmlProperty(localName = "MaxLevel")
    private Integer maxLevel;
    @JacksonXmlProperty(localName = "LeagueLevelUnitID")
    private Integer leagueLevelUnitId;
    @JacksonXmlProperty(localName = "LeagueLevelUnitName")
    private String leagueLevelUnitName;
    @JacksonXmlProperty(localName = "CurrentMatchRound")
    private Integer currentMatchRound;
    @JacksonXmlProperty(localName = "Teams")
    private List<Team> teams;

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Integer getLeagueLevel() {
        return leagueLevel;
    }

    public void setLeagueLevel(Integer leagueLevel) {
        this.leagueLevel = leagueLevel;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Integer getLeagueLevelUnitId() {
        return leagueLevelUnitId;
    }

    public void setLeagueLevelUnitId(Integer leagueLevelUnitId) {
        this.leagueLevelUnitId = leagueLevelUnitId;
    }

    public String getLeagueLevelUnitName() {
        return leagueLevelUnitName;
    }

    public void setLeagueLevelUnitName(String leagueLevelUnitName) {
        this.leagueLevelUnitName = leagueLevelUnitName;
    }

    public Integer getCurrentMatchRound() {
        return currentMatchRound;
    }

    public void setCurrentMatchRound(Integer currentMatchRound) {
        this.currentMatchRound = currentMatchRound;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
