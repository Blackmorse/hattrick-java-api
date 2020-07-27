package com.blackmorse.hattrick.api.teamdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JacksonXmlProperty(localName = "TeamID")
    private Long teamId;
    @JacksonXmlProperty(localName = "TeamName")
    private String teamName;
    @JacksonXmlProperty(localName = "ShortTeamName")
    private String shortTeamName;
    @JacksonXmlProperty(localName = "IsPrimaryClub")
    private Boolean isPrimaryClub;
    @JacksonXmlProperty(localName = "FoundedDate")
    private Date foundedDate;
    @JacksonXmlProperty(localName = "Arena")
    private Arena arena;
    @JacksonXmlProperty(localName = "League")
    private League league;
    @JacksonXmlProperty(localName = "Country")
    private Country country;
    @JacksonXmlProperty(localName = "Region")
    private Region region;
    @JacksonXmlProperty(localName = "Trainer")
    private Trainer trainer;
    @JacksonXmlProperty(localName = "HomePage")
    private String homePage;
    @JacksonXmlProperty(localName = "PowerRating")
    private PowerRating powerRating;
    @JacksonXmlProperty(localName = "FriendlyTeamID")
    private Long friendlyTeamId;
    @JacksonXmlProperty(localName = "LeagueLevelUnit")
    private LeagueLevelUnit leagueLevelUnit;
    @JacksonXmlProperty(localName = "NumberOfVictories")
    private Integer numberOfVictories;
    @JacksonXmlProperty(localName = "NumberOfUndefeated")
    private Integer numberOfUndefeated;
    @JacksonXmlProperty(localName = "Fanclub")
    private Fanclub fanclub;
    @JacksonXmlProperty(localName = "YouthTeamID")
    private Long youthTeamId;
    @JacksonXmlProperty(localName = "YouthTeamName")
    private String youthTeamName;
    @JacksonXmlProperty(localName = "Flags")
    private Flags flags;
    @JacksonXmlProperty(localName = "TrophyList")
    private List<Trophy> trophyList;

    public Team() {
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getShortTeamName() {
        return shortTeamName;
    }

    public void setShortTeamName(String shortTeamName) {
        this.shortTeamName = shortTeamName;
    }

    public Boolean getPrimaryClub() {
        return isPrimaryClub;
    }

    public void setPrimaryClub(Boolean primaryClub) {
        isPrimaryClub = primaryClub;
    }

    public Date getFoundedDate() {
        return foundedDate;
    }

    public void setFoundedDate(Date foundedDate) {
        this.foundedDate = foundedDate;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public LeagueLevelUnit getLeagueLevelUnit() {
        return leagueLevelUnit;
    }

    public void setLeagueLevelUnit(LeagueLevelUnit leagueLevelUnit) {
        this.leagueLevelUnit = leagueLevelUnit;
    }

    public Arena getArena() {
        return arena;
    }

    public void setArena(Arena arena) {
        this.arena = arena;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public PowerRating getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(PowerRating powerRating) {
        this.powerRating = powerRating;
    }

    public Long getFriendlyTeamId() {
        return friendlyTeamId;
    }

    public void setFriendlyTeamId(Long friendlyTeamId) {
        this.friendlyTeamId = friendlyTeamId;
    }

    public Integer getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(Integer numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    public Integer getNumberOfUndefeated() {
        return numberOfUndefeated;
    }

    public void setNumberOfUndefeated(Integer numberOfUndefeated) {
        this.numberOfUndefeated = numberOfUndefeated;
    }

    public Fanclub getFanclub() {
        return fanclub;
    }

    public void setFanclub(Fanclub fanclub) {
        this.fanclub = fanclub;
    }

    public Long getYouthTeamId() {
        return youthTeamId;
    }

    public void setYouthTeamId(Long youthTeamId) {
        this.youthTeamId = youthTeamId;
    }

    public String getYouthTeamName() {
        return youthTeamName;
    }

    public void setYouthTeamName(String youthTeamName) {
        this.youthTeamName = youthTeamName;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public List<Trophy> getTrophyList() {
        return trophyList;
    }

    public void setTrophyList(List<Trophy> trophyList) {
        this.trophyList = trophyList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
