package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fanclub {
    @JacksonXmlProperty(localName = "FanclubID")
    private Long fanclubId;
    @JacksonXmlProperty(localName = "FanclubName")
    private String fanclubName;
    @JacksonXmlProperty(localName = "FanclubSize")
    private Integer fanclubSize;

    public Long getFanclubId() {
        return fanclubId;
    }

    public void setFanclubId(Long fanclubId) {
        this.fanclubId = fanclubId;
    }

    public String getFanclubName() {
        return fanclubName;
    }

    public void setFanclubName(String fanclubName) {
        this.fanclubName = fanclubName;
    }

    public Integer getFanclubSize() {
        return fanclubSize;
    }

    public void setFanclubSize(Integer fanclubSize) {
        this.fanclubSize = fanclubSize;
    }
}
