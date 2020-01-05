package com.blackmorse.hattrick.api.matchlineup.model;

import com.blackmorse.hattrick.model.enums.MatchOrderTypeId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Substitution {
    @JacksonXmlProperty(localName = "TeamID")
    private Long teamId;
    @JacksonXmlProperty(localName = "SubjectPlayerID")
    private Long subjectPlayerId;
    @JacksonXmlProperty(localName = "ObjectPlayerID")
    private Long objectPlayerId;
    @JacksonXmlProperty(localName = "OrderType")
    private MatchOrderTypeId orderType;
    @JacksonXmlProperty(localName = "NewPositionId")
    private Integer newPositionId;
    @JacksonXmlProperty(localName = "NewPositionBehaviour")
    private Integer newPositionBehaviour;
    @JacksonXmlProperty(localName = "MatchMinute")
    private Integer matchMinute;
    @JacksonXmlProperty(localName = "MatchPart")
    private Integer matchPart;

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getSubjectPlayerId() {
        return subjectPlayerId;
    }

    public void setSubjectPlayerId(Long subjectPlayerId) {
        this.subjectPlayerId = subjectPlayerId;
    }

    public Long getObjectPlayerId() {
        return objectPlayerId;
    }

    public void setObjectPlayerId(Long objectPlayerId) {
        this.objectPlayerId = objectPlayerId;
    }

    public MatchOrderTypeId getOrderType() {
        return orderType;
    }

    public void setOrderType(MatchOrderTypeId orderType) {
        this.orderType = orderType;
    }

    public Integer getNewPositionId() {
        return newPositionId;
    }

    public void setNewPositionId(Integer newPositionId) {
        this.newPositionId = newPositionId;
    }

    public Integer getNewPositionBehaviour() {
        return newPositionBehaviour;
    }

    public void setNewPositionBehaviour(Integer newPositionBehaviour) {
        this.newPositionBehaviour = newPositionBehaviour;
    }

    public Integer getMatchMinute() {
        return matchMinute;
    }

    public void setMatchMinute(Integer matchMinute) {
        this.matchMinute = matchMinute;
    }

    public Integer getMatchPart() {
        return matchPart;
    }

    public void setMatchPart(Integer matchPart) {
        this.matchPart = matchPart;
    }
}
