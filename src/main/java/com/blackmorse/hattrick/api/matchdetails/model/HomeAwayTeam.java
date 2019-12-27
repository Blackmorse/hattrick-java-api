package com.blackmorse.hattrick.api.matchdetails.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

abstract public class HomeAwayTeam {
    @JacksonXmlProperty(localName = "DressURI")
    private String dressUri;
    @JacksonXmlProperty(localName = "Formation")
    private String formation;
    @JacksonXmlProperty(localName = "TacticType")
    private Integer tacticType;
    @JacksonXmlProperty(localName = "TacticSkill")
    private Integer tacticSkill;
    @JacksonXmlProperty(localName = "RatingMidfield")
    private Integer ratingMidfield;
    @JacksonXmlProperty(localName = "RatingRightDef")
    private Integer ratingRightDef;
    @JacksonXmlProperty(localName = "RatingLeftDef")
    private Integer ratingLeftDef;
    @JacksonXmlProperty(localName = "RatingMidDef")
    private Integer ratingMidDef;
    @JacksonXmlProperty(localName = "RatingRightAtt")
    private Integer ratingRightAtt;
    @JacksonXmlProperty(localName = "RatingMidAtt")
    private Integer ratingMidAtt;
    @JacksonXmlProperty(localName = "RatingLeftAtt")
    private Integer ratingLeftAtt;
    @JacksonXmlProperty(localName = "RatingIndirectSetPiecesDef")
    private Integer ratingIndirectSetPiecesDef;
    @JacksonXmlProperty(localName = "RatingIndirectSetPiecesAtt")
    private Integer ratingIndirectSetPiecesAtt;

    public String getDressUri() {
        return dressUri;
    }

    public void setDressUri(String dressUri) {
        this.dressUri = dressUri;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }

    public Integer getTacticType() {
        return tacticType;
    }

    public void setTacticType(Integer tacticType) {
        this.tacticType = tacticType;
    }

    public Integer getTacticSkill() {
        return tacticSkill;
    }

    public void setTacticSkill(Integer tacticSkill) {
        this.tacticSkill = tacticSkill;
    }

    public Integer getRatingMidfield() {
        return ratingMidfield;
    }

    public void setRatingMidfield(Integer ratingMidfield) {
        this.ratingMidfield = ratingMidfield;
    }

    public Integer getRatingRightDef() {
        return ratingRightDef;
    }

    public void setRatingRightDef(Integer ratingRightDef) {
        this.ratingRightDef = ratingRightDef;
    }

    public Integer getRatingLeftDef() {
        return ratingLeftDef;
    }

    public void setRatingLeftDef(Integer ratingLeftDef) {
        this.ratingLeftDef = ratingLeftDef;
    }

    public Integer getRatingMidDef() {
        return ratingMidDef;
    }

    public void setRatingMidDef(Integer ratingMidDef) {
        this.ratingMidDef = ratingMidDef;
    }

    public Integer getRatingRightAtt() {
        return ratingRightAtt;
    }

    public void setRatingRightAtt(Integer ratingRightAtt) {
        this.ratingRightAtt = ratingRightAtt;
    }

    public Integer getRatingMidAtt() {
        return ratingMidAtt;
    }

    public void setRatingMidAtt(Integer ratingMidAtt) {
        this.ratingMidAtt = ratingMidAtt;
    }

    public Integer getRatingLeftAtt() {
        return ratingLeftAtt;
    }

    public void setRatingLeftAtt(Integer ratingLeftAtt) {
        this.ratingLeftAtt = ratingLeftAtt;
    }

    public Integer getRatingIndirectSetPiecesDef() {
        return ratingIndirectSetPiecesDef;
    }

    public void setRatingIndirectSetPiecesDef(Integer ratingIndirectSetPiecesDef) {
        this.ratingIndirectSetPiecesDef = ratingIndirectSetPiecesDef;
    }

    public Integer getRatingIndirectSetPiecesAtt() {
        return ratingIndirectSetPiecesAtt;
    }

    public void setRatingIndirectSetPiecesAtt(Integer ratingIndirectSetPiecesAtt) {
        this.ratingIndirectSetPiecesAtt = ratingIndirectSetPiecesAtt;
    }
}
