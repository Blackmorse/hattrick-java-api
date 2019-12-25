package com.blackmorse.hattrick.api.nationalteams;

import com.blackmorse.hattrick.api.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class NationalTeams extends Model {
    @JacksonXmlProperty(localName = "userID")
    private Long userID;
    @JacksonXmlProperty(localName = "NationalTeams")
    private List<NationalTeam> nationalTeams;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class NationalTeam {
        @JacksonXmlProperty(localName = "NationalTeamID")
        private Integer nationalTeamId;
    }
}
