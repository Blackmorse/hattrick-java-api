package com.blackmorse.hattrick.api.players.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    @JacksonXmlProperty(localName = "PlayerID")
    private Long playerId;
    @JacksonXmlProperty(localName = "FirstName")
    private String firstName;
    @JacksonXmlProperty(localName = "NickName")
    private String nickName;
    @JacksonXmlProperty(localName = "LastName")
    private String lastName;
    @JacksonXmlProperty(localName = "PlayerNumber")
    private Integer playerNumber;
    @JacksonXmlProperty(localName = "Age")
    private Integer age;
    @JacksonXmlProperty(localName = "AgeDays")
    private Integer ageDays;
    @JacksonXmlProperty(localName = "ArrivalDate")
    private Date arrivalDate;
    @JacksonXmlProperty(localName = "OwnerNotes")
    private String ownerNotes;
    @JacksonXmlProperty(localName = "TSI")
    private Integer tsi;
    @JacksonXmlProperty(localName = "PlayerForm")
    private Integer playerForm;
    @JacksonXmlProperty(localName = "Statement")
    private String statement;
    @JacksonXmlProperty(localName = "Experience")
    private Integer experience;
    @JacksonXmlProperty(localName = "Loyalty")
    private Integer loyalty;
    @JacksonXmlProperty(localName = "MotherClubBonus")
    private Boolean motherClubBonus;
    @JacksonXmlProperty(localName = "Leadership")
    private Integer leadership;
    @JacksonXmlProperty(localName = "Salary")
    private Integer salary;
    @JacksonXmlProperty(localName = "IsAbroad")
    private Integer isAbroad;
    @JacksonXmlProperty(localName = "Agreeability")
    private Integer agreeability;
    @JacksonXmlProperty(localName = "Aggressiveness")
    private Integer aggressiveness;
    @JacksonXmlProperty(localName = "Honesty")
    private Integer honesty;
    @JacksonXmlProperty(localName = "LeagueGoals")
    private Integer leagueGoals;
    @JacksonXmlProperty(localName = "CupGoals")
    private Integer cupGoals;
    @JacksonXmlProperty(localName = "FriendliesGoals")
    private Integer friendliesGoals;
    @JacksonXmlProperty(localName = "CareerGoals")
    private Integer careerGoals;
    @JacksonXmlProperty(localName = "CareerHattricks")
    private Integer careerHattricks;
    @JacksonXmlProperty(localName = "MatchesCurrentTeam")
    private Integer matchesCurrentTeam;
    @JacksonXmlProperty(localName = "GoalsCurrentTeam")
    private Integer goalsCurrentTeam;
    @JacksonXmlProperty(localName = "Specialty")
    private Integer specialty;
    @JacksonXmlProperty(localName = "TransferListed")
    private Integer transferListed;
    @JacksonXmlProperty(localName = "NationalTeamID")
    private Integer nationalTeamId;
    @JacksonXmlProperty(localName = "CountryID")
    private Integer countryId;
    @JacksonXmlProperty(localName = "Caps")
    private Integer caps;
    @JacksonXmlProperty(localName = "CapsU20")
    private Integer capsU20;
    @JacksonXmlProperty(localName = "Cards")
    private Integer cards;
    @JacksonXmlProperty(localName = "InjuryLevel")
    private Integer injuryLevel;
    @JacksonXmlProperty(localName = "StaminaSkill")
    private Integer staminaSkill;
    @JacksonXmlProperty(localName = "TrainerData")
    private TrainerData trainerData;
    @JacksonXmlProperty(localName = "LastMatch")
    private LastMatch lastMatch;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(Integer playerNumber) {
        this.playerNumber = playerNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAgeDays() {
        return ageDays;
    }

    public void setAgeDays(Integer ageDays) {
        this.ageDays = ageDays;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getOwnerNotes() {
        return ownerNotes;
    }

    public void setOwnerNotes(String ownerNotes) {
        this.ownerNotes = ownerNotes;
    }

    public Integer getTsi() {
        return tsi;
    }

    public void setTsi(Integer tsi) {
        this.tsi = tsi;
    }

    public Integer getPlayerForm() {
        return playerForm;
    }

    public void setPlayerForm(Integer playerForm) {
        this.playerForm = playerForm;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Integer getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(Integer loyalty) {
        this.loyalty = loyalty;
    }

    public Boolean getMotherClubBonus() {
        return motherClubBonus;
    }

    public void setMotherClubBonus(Boolean motherClubBonus) {
        this.motherClubBonus = motherClubBonus;
    }

    public Integer getLeadership() {
        return leadership;
    }

    public void setLeadership(Integer leadership) {
        this.leadership = leadership;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getIsAbroad() {
        return isAbroad;
    }

    public void setIsAbroad(Integer isAbroad) {
        this.isAbroad = isAbroad;
    }

    public Integer getAgreeability() {
        return agreeability;
    }

    public void setAgreeability(Integer agreeability) {
        this.agreeability = agreeability;
    }

    public Integer getAggressiveness() {
        return aggressiveness;
    }

    public void setAggressiveness(Integer aggressiveness) {
        this.aggressiveness = aggressiveness;
    }

    public Integer getHonesty() {
        return honesty;
    }

    public void setHonesty(Integer honesty) {
        this.honesty = honesty;
    }

    public Integer getLeagueGoals() {
        return leagueGoals;
    }

    public void setLeagueGoals(Integer leagueGoals) {
        this.leagueGoals = leagueGoals;
    }

    public Integer getCupGoals() {
        return cupGoals;
    }

    public void setCupGoals(Integer cupGoals) {
        this.cupGoals = cupGoals;
    }

    public Integer getFriendliesGoals() {
        return friendliesGoals;
    }

    public void setFriendliesGoals(Integer friendliesGoals) {
        this.friendliesGoals = friendliesGoals;
    }

    public Integer getCareerGoals() {
        return careerGoals;
    }

    public void setCareerGoals(Integer careerGoals) {
        this.careerGoals = careerGoals;
    }

    public Integer getCareerHattricks() {
        return careerHattricks;
    }

    public void setCareerHattricks(Integer careerHattricks) {
        this.careerHattricks = careerHattricks;
    }

    public Integer getMatchesCurrentTeam() {
        return matchesCurrentTeam;
    }

    public void setMatchesCurrentTeam(Integer matchesCurrentTeam) {
        this.matchesCurrentTeam = matchesCurrentTeam;
    }

    public Integer getGoalsCurrentTeam() {
        return goalsCurrentTeam;
    }

    public void setGoalsCurrentTeam(Integer goalsCurrentTeam) {
        this.goalsCurrentTeam = goalsCurrentTeam;
    }

    public Integer getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Integer specialty) {
        this.specialty = specialty;
    }

    public Integer getTransferListed() {
        return transferListed;
    }

    public void setTransferListed(Integer transferListed) {
        this.transferListed = transferListed;
    }

    public Integer getNationalTeamId() {
        return nationalTeamId;
    }

    public void setNationalTeamId(Integer nationalTeamId) {
        this.nationalTeamId = nationalTeamId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getCaps() {
        return caps;
    }

    public void setCaps(Integer caps) {
        this.caps = caps;
    }

    public Integer getCapsU20() {
        return capsU20;
    }

    public void setCapsU20(Integer capsU20) {
        this.capsU20 = capsU20;
    }

    public Integer getCards() {
        return cards;
    }

    public void setCards(Integer cards) {
        this.cards = cards;
    }

    public Integer getInjuryLevel() {
        return injuryLevel;
    }

    public void setInjuryLevel(Integer injuryLevel) {
        this.injuryLevel = injuryLevel;
    }

    public Integer getStaminaSkill() {
        return staminaSkill;
    }

    public void setStaminaSkill(Integer staminaSkill) {
        this.staminaSkill = staminaSkill;
    }

    public LastMatch getLastMatch() {
        return lastMatch;
    }

    public void setLastMatch(LastMatch lastMatch) {
        this.lastMatch = lastMatch;
    }
}
