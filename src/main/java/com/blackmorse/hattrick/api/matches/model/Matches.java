package com.blackmorse.hattrick.api.matches.model;

import com.blackmorse.hattrick.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Matches extends Model {
    @JacksonXmlProperty(localName = "IsYouth")
    private Boolean isYouth;
    @JacksonXmlProperty(localName = "Team")
    private Team team;

    public Boolean getYouth() {
        return isYouth;
    }

    public void setYouth(Boolean youth) {
        isYouth = youth;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
