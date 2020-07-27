package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flag {
    @JacksonXmlProperty(localName = "LeagueId")
    private Integer leagueId;
    @JacksonXmlProperty(localName = "LeagueName")
    private String leagueName;
    @JacksonXmlProperty(localName = "CountryCode")
    private String countryCode;

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
