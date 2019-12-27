package com.blackmorse.hattrick.api.matchlineup.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "TeamID")
    private Integer teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "ExperienceLevel")
    private Integer experienceLevel;
    @JacksonXmlProperty(localName = "StyleOfPlay")
    private Integer styleOfPlay;
    @JacksonXmlProperty(localName = "StartingLineup")
    private List<StartingLineUpPlayer> startingLineUp;
    @JacksonXmlProperty(localName = "Lineup")
    private List<LineUpPlayer> lineUp;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(Integer experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public Integer getStyleOfPlay() {
        return styleOfPlay;
    }

    public void setStyleOfPlay(Integer styleOfPlay) {
        this.styleOfPlay = styleOfPlay;
    }

    public List<StartingLineUpPlayer> getStartingLineUp() {
        return startingLineUp;
    }

    public void setStartingLineUp(List<StartingLineUpPlayer> startingLineUp) {
        this.startingLineUp = startingLineUp;
    }

    public List<LineUpPlayer> getLineUp() {
        return lineUp;
    }

    public void setLineUp(List<LineUpPlayer> lineUp) {
        this.lineUp = lineUp;
    }
}
