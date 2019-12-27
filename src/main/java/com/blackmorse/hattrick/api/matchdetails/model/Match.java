package com.blackmorse.hattrick.api.matchdetails.model;

import com.blackmorse.hattrick.model.enums.MatchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JacksonXmlProperty(localName = "MatchID")
    private Long matchId;
    @JacksonXmlProperty(localName = "MatchType")
    private MatchType matchType;
    @JacksonXmlProperty(localName = "MatchContextId")
    private Integer matchContextId;
    @JacksonXmlProperty(localName = "MatchRuleId")
    private Integer matchRuleId;
    @JacksonXmlProperty(localName = "CupLevel")
    private Integer cupLevel;
    @JacksonXmlProperty(localName = "CupLevelIndex")
    private Integer cupLevelIndex;
    @JacksonXmlProperty(localName = "MatchDate")
    private Date matchDate;
    @JacksonXmlProperty(localName = "FinishedDate")
    private Date finishedDate;
    @JacksonXmlProperty(localName = "AddedMinutes")
    private Integer addedMinutes;
    @JacksonXmlProperty(localName = "HomeTeam")
    private HomeTeam homeTeam;
    @JacksonXmlProperty(localName = "AwayTeam")
    private AwayTeam awayTeam;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
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

    public Integer getMatchRuleId() {
        return matchRuleId;
    }

    public void setMatchRuleId(Integer matchRuleId) {
        this.matchRuleId = matchRuleId;
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

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public Date getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(Date finishedDate) {
        this.finishedDate = finishedDate;
    }

    public Integer getAddedMinutes() {
        return addedMinutes;
    }

    public void setAddedMinutes(Integer addedMinutes) {
        this.addedMinutes = addedMinutes;
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
}
