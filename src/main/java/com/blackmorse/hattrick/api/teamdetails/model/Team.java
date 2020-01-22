package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

//TODO not completed!
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "TeamID")
    private Long teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "ShortTeamName")
    private String shortTeamName;
    @JacksonXmlProperty(localName = "IsPrimaryClub")
    private Boolean isPrimaryClub;
    @JacksonXmlProperty(localName = "FoundedDate")
    private Date foundedDate;
    @JacksonXmlProperty(localName = "League")
    private League league;
    @JacksonXmlProperty(localName = "LeagueLevelUnit")
    private LeagueLevelUnit leagueLevelUnit;

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

    public Boolean getPrimaryClub() {
        return isPrimaryClub;
    }

    public void setPrimaryClub(Boolean primaryClub) {
        isPrimaryClub = primaryClub;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
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
}
