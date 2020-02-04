package com.blackmorse.hattrick.api.players.model;

import com.blackmorse.hattrick.model.enums.MatchRoleId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LastMatch {
    @JacksonXmlProperty(localName = "Date")
    private Date date;
    @JacksonXmlProperty(localName = "MatchId")
    private Long matchId;
    @JacksonXmlProperty(localName = "PositionCode")
    private MatchRoleId positionCode;
    @JacksonXmlProperty(localName = "PlayedMinutes")
    private Integer playedMinutes;
    @JacksonXmlProperty(localName = "Rating")
    private Double rating;
    @JacksonXmlProperty(localName = "RatingEndOfGame")
    private Double ratingEndOfGame;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public MatchRoleId getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(MatchRoleId positionCode) {
        this.positionCode = positionCode;
    }

    public Integer getPlayedMinutes() {
        return playedMinutes;
    }

    public void setPlayedMinutes(Integer playedMinutes) {
        this.playedMinutes = playedMinutes;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getRatingEndOfGame() {
        return ratingEndOfGame;
    }

    public void setRatingEndOfGame(Double ratingEndOfGame) {
        this.ratingEndOfGame = ratingEndOfGame;
    }
}
