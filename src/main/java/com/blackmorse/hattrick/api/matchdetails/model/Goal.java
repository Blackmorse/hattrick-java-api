package com.blackmorse.hattrick.api.matchdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Goal {
    @JacksonXmlProperty(localName = "ScorerPlayerID")
    private Long scorerPlayerId;
    @JacksonXmlProperty(localName = "ScorerPlayerName")
    private String scorerPlayerName;
    @JacksonXmlProperty(localName = "ScorerTeamID")
    private Long scorerTeamId;
    @JacksonXmlProperty(localName = "ScorerHomeGoals")
    private Integer scorerHomeGoals;
    @JacksonXmlProperty(localName = "ScorerAwayGoals")
    private Integer scorerAwayGoals;
    @JacksonXmlProperty(localName = "ScorerMinute")
    private Integer scorerMinute;
    @JacksonXmlProperty(localName = "MatchPart")
    private Integer matchPart;

    public Long getScorerPlayerId() {
        return scorerPlayerId;
    }

    public void setScorerPlayerId(Long scorerPlayerId) {
        this.scorerPlayerId = scorerPlayerId;
    }

    public String getScorerPlayerName() {
        return scorerPlayerName;
    }

    public void setScorerPlayerName(String scorerPlayerName) {
        this.scorerPlayerName = scorerPlayerName;
    }

    public Long getScorerTeamId() {
        return scorerTeamId;
    }

    public void setScorerTeamId(Long scorerTeamId) {
        this.scorerTeamId = scorerTeamId;
    }

    public Integer getScorerHomeGoals() {
        return scorerHomeGoals;
    }

    public void setScorerHomeGoals(Integer scorerHomeGoals) {
        this.scorerHomeGoals = scorerHomeGoals;
    }

    public Integer getScorerAwayGoals() {
        return scorerAwayGoals;
    }

    public void setScorerAwayGoals(Integer scorerAwayGoals) {
        this.scorerAwayGoals = scorerAwayGoals;
    }

    public Integer getScorerMinute() {
        return scorerMinute;
    }

    public void setScorerMinute(Integer scorerMinute) {
        this.scorerMinute = scorerMinute;
    }

    public Integer getMatchPart() {
        return matchPart;
    }

    public void setMatchPart(Integer matchPart) {
        this.matchPart = matchPart;
    }
}
