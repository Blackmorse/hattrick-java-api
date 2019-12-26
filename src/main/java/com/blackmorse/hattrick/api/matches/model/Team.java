package com.blackmorse.hattrick.api.matches.model;

import com.blackmorse.hattrick.model.common.League;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "TeamID")
    private Long teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "ShortTeamName")
    private String shortTeamName;
    @JacksonXmlProperty(localName = "League")
    private League league;
    @JacksonXmlProperty(localName = "LeagueLevelUnit")
    private LeagueLevelUnit leagueLevelUnit;
    @JacksonXmlProperty(localName = "MatchList")
    private List<Match> matchList;
}
