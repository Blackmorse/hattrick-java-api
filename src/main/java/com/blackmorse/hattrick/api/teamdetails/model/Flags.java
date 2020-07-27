package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flags {
    @JacksonXmlProperty(localName = "HomeFlags")
    private List<Flag> homeFlags;
    @JacksonXmlProperty(localName = "AwayFlags")
    private List<Flag> awayFlags;

    public List<Flag> getHomeFlags() {
        return homeFlags;
    }

    public void setHomeFlags(List<Flag> homeFlags) {
        this.homeFlags = homeFlags;
    }

    public List<Flag> getAwayFlags() {
        return awayFlags;
    }

    public void setAwayFlags(List<Flag> awayFlags) {
        this.awayFlags = awayFlags;
    }
}
