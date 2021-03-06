package com.blackmorse.hattrick.api.matchlineup.model;

import com.blackmorse.hattrick.model.enums.MatchRoleId;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

abstract public class Player {
    @JacksonXmlProperty(localName = "PlayerID")
    private Long playerId;
    @JacksonXmlProperty(localName = "RoleID")
    private MatchRoleId roleId;
    @JacksonXmlProperty(localName = "FirstName")
    private String firstName;
    @JacksonXmlProperty(localName = "LastName")
    private String lastName;
    @JacksonXmlProperty(localName = "NickName")
    private String nickName;

    public MatchRoleId getRoleId() {
        return roleId;
    }

    public void setRoleId(MatchRoleId roleId) {
        this.roleId = roleId;
    }

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
