package com.blackmorse.hattrick.api.nationalteams.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NationalTeam {
    @JacksonXmlProperty(localName = "NationalTeamID")
    private Integer nationalTeamId;
    @JacksonXmlProperty(localName = "NationalTeamName")
    private String nationalTeamName;
    @JacksonXmlProperty(localName = "Dress")
    private String dress;
    @JacksonXmlProperty(localName = "RatingScores")
    private Integer ratingScores;
    @JacksonXmlProperty(localName = "LeagueId")
    private Integer leagueId;

    public String getNationalTeamName() {
        return nationalTeamName;
    }

    public void setNationalTeamName(String nationalTeamName) {
        this.nationalTeamName = nationalTeamName;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    public Integer getRatingScores() {
        return ratingScores;
    }

    public void setRatingScores(Integer ratingScores) {
        this.ratingScores = ratingScores;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getNationalTeamId() {
        return nationalTeamId;
    }

    public void setNationalTeamId(Integer nationalTeamId) {
        this.nationalTeamId = nationalTeamId;
    }
}
