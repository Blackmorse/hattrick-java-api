package com.blackmorse.hattrick.api.matchdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AwayTeam {
    @JacksonXmlProperty(localName = "AwayTeamID")
    private Long awayTeamId;
    @JacksonXmlProperty(localName = "AwayTeamName")
    private String awayTeamName;
    @JacksonXmlProperty(localName = "AwayGoals")
    private Integer awayGoals;
}
