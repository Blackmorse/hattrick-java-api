package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Arena {
    @JacksonXmlProperty(localName = "ArenaID")
    private Long arenaId;
    @JacksonXmlProperty(localName = "ArenaName")
    private String arenaName;

    public Long getArenaId() {
        return arenaId;
    }

    public void setArenaId(Long arenaId) {
        this.arenaId = arenaId;
    }

    public String getArenaName() {
        return arenaName;
    }

    public void setArenaName(String arenaName) {
        this.arenaName = arenaName;
    }
}
