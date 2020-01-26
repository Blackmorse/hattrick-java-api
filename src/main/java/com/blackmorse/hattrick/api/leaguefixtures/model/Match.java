package com.blackmorse.hattrick.api.leaguefixtures.model;

import com.blackmorse.hattrick.model.common.AwayTeam;
import com.blackmorse.hattrick.model.common.HomeTeam;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JacksonXmlProperty(localName = "MatchID")
    private Long matchId;
    @JacksonXmlProperty(localName = "MatchRound")
    private Integer matchRound;
    @JacksonXmlProperty(localName = "HomeTeam")
    private HomeTeam homeTeam;
    @JacksonXmlProperty(localName = "AwayTeam")
    private AwayTeam awayTeam;
    @JacksonXmlProperty(localName = "MatchDate")
    private Date matchDate;
    @JacksonXmlProperty(localName = "HomeGoals")
    private Integer homeGoals;
    @JacksonXmlProperty(localName = "AwayGoals")
    private Integer awayGoals;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public Integer getMatchRound() {
        return matchRound;
    }

    public void setMatchRound(Integer matchRound) {
        this.matchRound = matchRound;
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
}
