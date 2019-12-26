package com.blackmorse.hattrick.api.leaguedetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "UserId")
    private Long userId;
    @JacksonXmlProperty(localName = "TeamID")
    private Long teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "Position")
    private Integer position;
    @JacksonXmlProperty(localName = "PositionChange")
    private Integer positionChange;
    @JacksonXmlProperty(localName = "Matches")
    private Integer matches;
    @JacksonXmlProperty(localName = "GoalsFor")
    private Integer goalsFor;
    @JacksonXmlProperty(localName = "GoalsAgainst")
    private Integer goalsAgainst;
    @JacksonXmlProperty(localName = "Points")
    private Integer points;
    @JacksonXmlProperty(localName = "Won")
    private Integer won;
    @JacksonXmlProperty(localName = "Draws")
    private Integer draws;
    @JacksonXmlProperty(localName = "Lost")
    private Integer lost;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getPositionChange() {
        return positionChange;
    }

    public void setPositionChange(Integer positionChange) {
        this.positionChange = positionChange;
    }

    public Integer getMatches() {
        return matches;
    }

    public void setMatches(Integer matches) {
        this.matches = matches;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }
}
