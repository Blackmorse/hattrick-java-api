package com.blackmorse.hattrick.api.matchlineup.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineUpPlayer extends Player {
    @JacksonXmlProperty(localName = "RatingStars")
    private Double ratingStars;
    @JacksonXmlProperty(localName = "RatingStarsEndOfMatch")
    private Double ratingStarsEndOfMatch;
    @JacksonXmlProperty(localName = "Behaviour")
    private Integer behaviour;

    public Double getRatingStars() {
        return ratingStars;
    }

    public void setRatingStars(Double ratingStars) {
        this.ratingStars = ratingStars;
    }

    public Double getRatingStarsEndOfMatch() {
        return ratingStarsEndOfMatch;
    }

    public void setRatingStarsEndOfMatch(Double ratingStarsEndOfMatch) {
        this.ratingStarsEndOfMatch = ratingStarsEndOfMatch;
    }

    public Integer getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(Integer behaviour) {
        this.behaviour = behaviour;
    }
}
