package com.blackmorse.hattrick.api.teamdetails.model;

import com.blackmorse.hattrick.api.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDetails extends Model {
    @JacksonXmlProperty(localName = "User")
    private User user;
    @JacksonXmlProperty(localName = "Teams")
    private List<Team> teams;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
