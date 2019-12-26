package com.blackmorse.hattrick.api.matches.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AwayTeam {
    @JacksonXmlProperty(localName = "AwayTeamID")
    private Long awayTeamId;
    @JacksonXmlProperty(localName = "AwayTeamName")
    private String awayTeamName;
    @JacksonXmlProperty(localName = "AwayTeamNameShortName")
    private String awayTeamNameShortName;

    public Long getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(Long awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamNameShortName() {
        return awayTeamNameShortName;
    }

    public void setAwayTeamNameShortName(String awayTeamNameShortName) {
        this.awayTeamNameShortName = awayTeamNameShortName;
    }
}
