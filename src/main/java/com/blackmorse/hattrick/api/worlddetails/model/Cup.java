package com.blackmorse.hattrick.api.worlddetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cup {
    @JacksonXmlProperty(localName = "CupID")
    private Integer cupId;
    @JacksonXmlProperty(localName = "CupName")
    private String cupName;
    @JacksonXmlProperty(localName = "CupLeagueLevel")
    private Integer cupLeagueLevel;
    @JacksonXmlProperty(localName = "CupLevel")
    private Integer cupLevel;
    @JacksonXmlProperty(localName = "CupLevelIndex")
    private Integer cupLevelIndex;
    @JacksonXmlProperty(localName = "MatchRound")
    private Integer matchRound;
    @JacksonXmlProperty(localName = "MatchRoundsLeft")
    private Integer matchRoundsLeft;

    public Integer getCupId() {
        return cupId;
    }

    public void setCupId(Integer cupId) {
        this.cupId = cupId;
    }

    public String getCupName() {
        return cupName;
    }

    public void setCupName(String cupName) {
        this.cupName = cupName;
    }

    public Integer getCupLeagueLevel() {
        return cupLeagueLevel;
    }

    public void setCupLeagueLevel(Integer cupLeagueLevel) {
        this.cupLeagueLevel = cupLeagueLevel;
    }

    public Integer getCupLevel() {
        return cupLevel;
    }

    public void setCupLevel(Integer cupLevel) {
        this.cupLevel = cupLevel;
    }

    public Integer getCupLevelIndex() {
        return cupLevelIndex;
    }

    public void setCupLevelIndex(Integer cupLevelIndex) {
        this.cupLevelIndex = cupLevelIndex;
    }

    public Integer getMatchRound() {
        return matchRound;
    }

    public void setMatchRound(Integer matchRound) {
        this.matchRound = matchRound;
    }

    public Integer getMatchRoundsLeft() {
        return matchRoundsLeft;
    }

    public void setMatchRoundsLeft(Integer matchRoundsLeft) {
        this.matchRoundsLeft = matchRoundsLeft;
    }
}
