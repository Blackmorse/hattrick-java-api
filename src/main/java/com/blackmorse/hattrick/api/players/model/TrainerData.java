package com.blackmorse.hattrick.api.players.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrainerData {
    @JacksonXmlProperty(localName = "TrainerType")
    private Integer trainerType;
    @JacksonXmlProperty(localName = "TrainerSkill")
    private Integer trainerSkill;

    public Integer getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(Integer trainerType) {
        this.trainerType = trainerType;
    }

    public Integer getTrainerSkill() {
        return trainerSkill;
    }

    public void setTrainerSkill(Integer trainerSkill) {
        this.trainerSkill = trainerSkill;
    }
}
