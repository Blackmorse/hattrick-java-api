package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NationalTeam {
    @JacksonXmlProperty(localName = "NationalTeamID")
    private Integer nationalTeamId;
    @JacksonXmlProperty(localName = "NationalTeamName")
    private String nationalTeamName;

    public Integer getNationalTeamId() {
        return nationalTeamId;
    }

    public void setNationalTeamId(Integer nationalTeamId) {
        this.nationalTeamId = nationalTeamId;
    }

    public String getNationalTeamName() {
        return nationalTeamName;
    }

    public void setNationalTeamName(String nationalTeamName) {
        this.nationalTeamName = nationalTeamName;
    }
}
