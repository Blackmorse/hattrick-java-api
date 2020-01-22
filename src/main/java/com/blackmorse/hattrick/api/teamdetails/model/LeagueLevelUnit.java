package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueLevelUnit {
    @JacksonXmlProperty(localName = "LeagueLevelUnitID")
    private Long leagueLevelUnitId;
    @JacksonXmlProperty(localName = "LeagueLevelUnitName")
    private String leagueLevelUnitName;
    @JacksonXmlProperty(localName = "LeagueLevel")
    private Integer leagueLevel;

    public Long getLeagueLevelUnitId() {
        return leagueLevelUnitId;
    }

    public void setLeagueLevelUnitId(Long leagueLevelUnitId) {
        this.leagueLevelUnitId = leagueLevelUnitId;
    }

    public String getLeagueLevelUnitName() {
        return leagueLevelUnitName;
    }

    public void setLeagueLevelUnitName(String leagueLevelUnitName) {
        this.leagueLevelUnitName = leagueLevelUnitName;
    }

    public Integer getLeagueLevel() {
        return leagueLevel;
    }

    public void setLeagueLevel(Integer leagueLevel) {
        this.leagueLevel = leagueLevel;
    }
}
