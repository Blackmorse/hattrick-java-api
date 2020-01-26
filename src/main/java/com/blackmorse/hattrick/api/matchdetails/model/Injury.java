package com.blackmorse.hattrick.api.matchdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Injury {
    @JacksonXmlProperty(localName = "InjuryPlayerID")
    private Long injuryPlayerId;
    @JacksonXmlProperty(localName = "InjuryPlayerName")
    private String injuryPlayerName;
    @JacksonXmlProperty(localName = "InjuryTeamID")
    private Long injuryTeamId;
    @JacksonXmlProperty(localName = "InjuryType")
    private Integer injuryType;
    @JacksonXmlProperty(localName = "InjuryMinute")
    private Integer injuryMinute;
    @JacksonXmlProperty(localName = "MatchPart")
    private Integer matchPart;

    public Long getInjuryPlayerId() {
        return injuryPlayerId;
    }

    public void setInjuryPlayerId(Long injuryPlayerId) {
        this.injuryPlayerId = injuryPlayerId;
    }

    public String getInjuryPlayerName() {
        return injuryPlayerName;
    }

    public void setInjuryPlayerName(String injuryPlayerName) {
        this.injuryPlayerName = injuryPlayerName;
    }

    public Long getInjuryTeamId() {
        return injuryTeamId;
    }

    public void setInjuryTeamId(Long injuryTeamId) {
        this.injuryTeamId = injuryTeamId;
    }

    public Integer getInjuryType() {
        return injuryType;
    }

    public void setInjuryType(Integer injuryType) {
        this.injuryType = injuryType;
    }

    public Integer getInjuryMinute() {
        return injuryMinute;
    }

    public void setInjuryMinute(Integer injureMinute) {
        this.injuryMinute = injureMinute;
    }

    public Integer getMatchPart() {
        return matchPart;
    }

    public void setMatchPart(Integer matchPart) {
        this.matchPart = matchPart;
    }
}
