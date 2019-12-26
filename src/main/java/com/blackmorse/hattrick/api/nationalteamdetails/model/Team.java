package com.blackmorse.hattrick.api.nationalteamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "TeamID")
    private Integer teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "ShortTeamName")
    private String shortTeamName;
    @JacksonXmlProperty(localName = "NationalCoach")
    private NationalCoach nationalCoach;
    @JacksonXmlProperty(localName = "League")
    private League league;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
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

    public NationalCoach getNationalCoach() {
        return nationalCoach;
    }

    public void setNationalCoach(NationalCoach nationalCoach) {
        this.nationalCoach = nationalCoach;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}
