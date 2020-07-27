package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PowerRating {
    @JacksonXmlProperty(localName = "GlobalRanking")
    private Integer globalRanking;
    @JacksonXmlProperty(localName = "LeagueRanking")
    private Integer leagueRanking;
    @JacksonXmlProperty(localName = "RegionRanking")
    private Integer regionRanking;
    @JacksonXmlProperty(localName = "PowerRating")
    private Integer powerRating;

    public Integer getGlobalRanking() {
        return globalRanking;
    }

    public void setGlobalRanking(Integer globalRanking) {
        this.globalRanking = globalRanking;
    }

    public Integer getLeagueRanking() {
        return leagueRanking;
    }

    public void setLeagueRanking(Integer leagueRanking) {
        this.leagueRanking = leagueRanking;
    }

    public Integer getRegionRanking() {
        return regionRanking;
    }

    public void setRegionRanking(Integer regionRanking) {
        this.regionRanking = regionRanking;
    }

    public Integer getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(Integer powerRating) {
        this.powerRating = powerRating;
    }
}
