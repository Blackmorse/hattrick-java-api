package com.blackmorse.hattrick.api.leaguefixtures.model;

import com.blackmorse.hattrick.model.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueFixtures extends Model {
    @JacksonXmlProperty(localName = "LeagueLevelUnitID")
    private Long leagueLevelUnitId;
    @JacksonXmlProperty(localName = "LeagueLevelUnitName")
    private String leagueLevelUnitName;
    @JacksonXmlProperty(localName = "Season")
    private String season;
    @JacksonXmlProperty(localName = "Matches")
    private List<Match> matches;

    public Long getLeagueLevelUnitId() {
        return leagueLevelUnitId;
    }

    public void setLeagueLevelUnitId(Long leagueLevelUnitId) {
        this.leagueLevelUnitId = leagueLevelUnitId;
    }

    public String getLeagueLevelUnitName() {
        return leagueLevelUnitName;
    }

    public void setLeagueLevelUnitName(String leagueLevelUnitName) {
        this.leagueLevelUnitName = leagueLevelUnitName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
