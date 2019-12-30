package com.blackmorse.hattrick.api.worlddetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class League {
    @JacksonXmlProperty(localName = "LeagueID")
    private Integer leagueId;
    @JacksonXmlProperty(localName = "LeagueName")
    private String leagueName;
    @JacksonXmlProperty(localName = "Season")
    private Integer season;
    @JacksonXmlProperty(localName = "SeasonOffset")
    private Integer seasonOffset;
    @JacksonXmlProperty(localName = "MatchRound")
    private Integer matchRound;
    @JacksonXmlProperty(localName = "ShortName")
    private String shortName;
    @JacksonXmlProperty(localName = "Continent")
    private String continent;
    @JacksonXmlProperty(localName = "EnglishName")
    private String englishName;
    @JacksonXmlProperty(localName = "Country")
    private Country country;
    @JacksonXmlProperty(localName = "Cups")
    private List<Cup> cups;
    @JacksonXmlProperty(localName = "NationalTeamId")
    private Integer nationalTeamId;
    @JacksonXmlProperty(localName = "U20TeamId")
    private Integer u20TeamId;
    @JacksonXmlProperty(localName = "ActiveTeams")
    private Integer activeTeams;
    @JacksonXmlProperty(localName = "ActiveUsers")
    private Integer activeUsers;
    @JacksonXmlProperty(localName = "WaitingUsers")
    private Integer waitingUsers;
    @JacksonXmlProperty(localName = "TrainingDate")
    private Date trainingDate;
    @JacksonXmlProperty(localName = "EconomyDate")
    private Date economyDate;
    @JacksonXmlProperty(localName = "CupMatchDate")
    private Date cupMatchDate;
    @JacksonXmlProperty(localName = "SeriesMatchDate")
    private Date seriesMatchDate;
    @JacksonXmlProperty(localName = "NumberOfLevels")
    private Integer numberOfLevels;

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getSeasonOffset() {
        return seasonOffset;
    }

    public void setSeasonOffset(Integer seasonOffset) {
        this.seasonOffset = seasonOffset;
    }

    public Integer getMatchRound() {
        return matchRound;
    }

    public void setMatchRound(Integer matchRound) {
        this.matchRound = matchRound;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Cup> getCups() {
        return cups;
    }

    public void setCups(List<Cup> cups) {
        this.cups = cups;
    }

    public Integer getNationalTeamId() {
        return nationalTeamId;
    }

    public void setNationalTeamId(Integer nationalTeamId) {
        this.nationalTeamId = nationalTeamId;
    }

    public Integer getU20TeamId() {
        return u20TeamId;
    }

    public void setU20TeamId(Integer u20TeamId) {
        this.u20TeamId = u20TeamId;
    }

    public Integer getActiveTeams() {
        return activeTeams;
    }

    public void setActiveTeams(Integer activeTeams) {
        this.activeTeams = activeTeams;
    }

    public Integer getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(Integer activeUsers) {
        this.activeUsers = activeUsers;
    }

    public Integer getWaitingUsers() {
        return waitingUsers;
    }

    public void setWaitingUsers(Integer waitingUsers) {
        this.waitingUsers = waitingUsers;
    }

    public Date getTrainingDate() {
        return trainingDate;
    }

    public void setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    public Date getEconomyDate() {
        return economyDate;
    }

    public void setEconomyDate(Date economyDate) {
        this.economyDate = economyDate;
    }

    public Date getCupMatchDate() {
        return cupMatchDate;
    }

    public void setCupMatchDate(Date cupMatchDate) {
        this.cupMatchDate = cupMatchDate;
    }

    public Date getSeriesMatchDate() {
        return seriesMatchDate;
    }

    public void setSeriesMatchDate(Date seriesMatchDate) {
        this.seriesMatchDate = seriesMatchDate;
    }

    public Integer getNumberOfLevels() {
        return numberOfLevels;
    }

    public void setNumberOfLevels(Integer numberOfLevels) {
        this.numberOfLevels = numberOfLevels;
    }
}
