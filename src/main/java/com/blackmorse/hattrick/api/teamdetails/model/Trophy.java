package com.blackmorse.hattrick.api.teamdetails.model;

import com.blackmorse.hattrick.model.enums.TrophyTypeId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Trophy {
    @JacksonXmlProperty(localName = "TrophyTypeId")
    private TrophyTypeId trophyTypeId;
    @JacksonXmlProperty(localName = "TrophySeason")
    private Integer trophySeason;
    @JacksonXmlProperty(localName = "LeagueLevel")
    private Integer leagueLevel;
    @JacksonXmlProperty(localName = "LeagueLevelUnitName")
    private String leagueLevelUnitName;
    @JacksonXmlProperty(localName = "GainedDate")
    private Date gainedDate;
    @JacksonXmlProperty(localName = "ImageUrl")
    private String imageUrl;

    public TrophyTypeId getTrophyTypeId() {
        return trophyTypeId;
    }

    public void setTrophyTypeId(TrophyTypeId trophyTypeId) {
        this.trophyTypeId = trophyTypeId;
    }

    public Integer getTrophySeason() {
        return trophySeason;
    }

    public void setTrophySeason(Integer trophySeason) {
        this.trophySeason = trophySeason;
    }

    public Integer getLeagueLevel() {
        return leagueLevel;
    }

    public void setLeagueLevel(Integer leagueLevel) {
        this.leagueLevel = leagueLevel;
    }

    public String getLeagueLevelUnitName() {
        return leagueLevelUnitName;
    }

    public void setLeagueLevelUnitName(String leagueLevelUnitName) {
        this.leagueLevelUnitName = leagueLevelUnitName;
    }

    public Date getGainedDate() {
        return gainedDate;
    }

    public void setGainedDate(Date gainedDate) {
        this.gainedDate = gainedDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
