package com.blackmorse.hattrick.api.matchlineup.model;

import com.blackmorse.hattrick.model.common.AwayTeam;
import com.blackmorse.hattrick.model.common.HomeTeam;
import com.blackmorse.hattrick.model.Model;
import com.blackmorse.hattrick.model.enums.MatchType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchLineUp extends Model {
    @JacksonXmlProperty(localName = "IsYouth")
    private Boolean isYouth;
    @JacksonXmlProperty(localName = "MatchID")
    private Long matchId;
    @JacksonXmlProperty(localName = "HomeTeam")
    private HomeTeam homeTeam;
    @JacksonXmlProperty(localName = "AwayTeam")
    private AwayTeam awayTeam;
    @JacksonXmlProperty(localName = "MatchType")
    private MatchType matchType;
    @JacksonXmlProperty(localName = "Team")
    private Team team;

    public Boolean getYouth() {
        return isYouth;
    }

    public void setYouth(Boolean youth) {
        isYouth = youth;
    }

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

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
