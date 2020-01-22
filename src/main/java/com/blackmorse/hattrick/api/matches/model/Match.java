package com.blackmorse.hattrick.api.matches.model;

import com.blackmorse.hattrick.model.enums.MatchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JacksonXmlProperty(localName = "MatchID")
    private Long matchId;
    @JacksonXmlProperty(localName = "HomeTeam")
    private HomeTeam homeTeam;
    @JacksonXmlProperty(localName = "AwayTeam")
    private AwayTeam awayTeam;
    @JacksonXmlProperty(localName = "MatchDate")
    private Date matchDate;
    @JacksonXmlProperty(localName = "SourceSystem")
    private String sourceSystem;
    @JacksonXmlProperty(localName = "MatchType")
    private MatchType matchType;
    @JacksonXmlProperty(localName = "MatchContextId")
    private Integer matchContextId;
    @JacksonXmlProperty(localName = "CupLevel")
    private Integer cupLevel;
    @JacksonXmlProperty(localName = "CupLevelIndex")
    private Integer cupLevelIndex;
    @JacksonXmlProperty(localName = "HomeGoals")
    private Integer homeGoals;
    @JacksonXmlProperty(localName = "AwayGoals")
    private Integer awayGoals;
    @JacksonXmlProperty(localName = "Status")
    private String status;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public Integer getMatchContextId() {
        return matchContextId;
    }

    public void setMatchContextId(Integer matchContextId) {
        this.matchContextId = matchContextId;
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

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
