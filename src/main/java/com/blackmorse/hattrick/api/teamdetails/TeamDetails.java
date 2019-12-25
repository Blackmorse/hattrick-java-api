package com.blackmorse.hattrick.api.teamdetails;

import com.blackmorse.hattrick.api.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDetails extends Model {
    @JacksonXmlProperty(localName = "User")
    private User user;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class User {
        @JacksonXmlProperty(localName = "UserID")
        private Long userId;
    }
}
