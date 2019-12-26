package com.blackmorse.hattrick.api.nationalteamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NationalCoach {
    @JacksonXmlProperty(localName = "NationalCoachUserID")
    private Long nationalCoachUserId;
    @JacksonXmlProperty(localName = "NationalCoachLoginname")
    private String nationalCoachLoginname;

    public Long getNationalCoachUserId() {
        return nationalCoachUserId;
    }

    public void setNationalCoachUserId(Long nationalCoachUserId) {
        this.nationalCoachUserId = nationalCoachUserId;
    }

    public String getNationalCoachLoginname() {
        return nationalCoachLoginname;
    }

    public void setNationalCoachLoginname(String nationalCoachLoginname) {
        this.nationalCoachLoginname = nationalCoachLoginname;
    }
}
