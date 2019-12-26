package com.blackmorse.hattrick.api.nationalteams.model;

import com.blackmorse.hattrick.api.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class NationalTeams extends Model {
    @JacksonXmlProperty(localName = "NationalTeams")
    private List<NationalTeam> nationalTeams;

    public List<NationalTeam> getNationalTeams() {
        return nationalTeams;
    }

    public void setNationalTeams(List<NationalTeam> nationalTeams) {
        this.nationalTeams = nationalTeams;
    }
}
