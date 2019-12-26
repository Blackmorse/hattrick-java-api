package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JacksonXmlProperty(localName = "UserID")
    private Long userId;
    @JacksonXmlProperty(localName = "Language")
    private Language language;
    @JacksonXmlProperty(localName = "SupporterTier")
    private String supporterTier;
    @JacksonXmlProperty(localName = "Loginname")
    private String loginname;
    @JacksonXmlProperty(localName = "Name")
    private String name;
    @JacksonXmlProperty(localName = "ICQ")
    private String icq;
    @JacksonXmlProperty(localName = "SignupDate")
    private Date signupDate;
    @JacksonXmlProperty(localName = "ActivationDate")
    private Date activationDate;
    @JacksonXmlProperty(localName = "LastLoginDate")
    private Date lastLoginDate;
    @JacksonXmlProperty(localName = "HasManagerLicese")
    private Boolean hasManagerLicese;
    @JacksonXmlProperty(localName = "NationalTeamCoach")
    private Boolean nationalTeamCoach;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getSupporterTier() {
        return supporterTier;
    }

    public void setSupporterTier(String supporterTier) {
        this.supporterTier = supporterTier;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Boolean getHasManagerLicese() {
        return hasManagerLicese;
    }

    public void setHasManagerLicese(Boolean hasManagerLicese) {
        this.hasManagerLicese = hasManagerLicese;
    }

    public Boolean getNationalTeamCoach() {
        return nationalTeamCoach;
    }

    public void setNationalTeamCoach(Boolean nationalTeamCoach) {
        this.nationalTeamCoach = nationalTeamCoach;
    }
}
