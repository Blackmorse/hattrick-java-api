package com.blackmorse.hattrick.api.players.model;

import com.blackmorse.hattrick.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Players extends Model {
    @JacksonXmlProperty(localName = "IsYouth")
    private Boolean isYouth;
    @JacksonXmlProperty(localName = "ActionType")
    private String actionType;
    @JacksonXmlProperty(localName = "IsPlayingMatch")
    private Boolean isPlayingMatch;
    @JacksonXmlProperty(localName = "Team")
    private Team team;

    public Boolean getYouth() {
        return isYouth;
    }

    public void setYouth(Boolean youth) {
        isYouth = youth;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public Boolean getPlayingMatch() {
        return isPlayingMatch;
    }

    public void setPlayingMatch(Boolean playingMatch) {
        isPlayingMatch = playingMatch;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
