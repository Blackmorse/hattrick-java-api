package com.blackmorse.hattrick.api.matchdetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {
    @JacksonXmlProperty(localName = "BookingPlayerID")
    private Long bookingPlayerId;
    @JacksonXmlProperty(localName = "BookingPlayerName")
    private String bookingPlayerName;
    @JacksonXmlProperty(localName = "BookingTeamID")
    private Long bookingTeamId;
    @JacksonXmlProperty(localName = "BookingType")
    private Integer bookingType;
    @JacksonXmlProperty(localName = "BookingMinute")
    private Integer bookingMinute;
    @JacksonXmlProperty(localName = "MatchPart")
    private Integer matchPart;

    public Long getBookingPlayerId() {
        return bookingPlayerId;
    }

    public void setBookingPlayerId(Long bookingPlayerId) {
        this.bookingPlayerId = bookingPlayerId;
    }

    public String getBookingPlayerName() {
        return bookingPlayerName;
    }

    public void setBookingPlayerName(String bookingPlayerName) {
        this.bookingPlayerName = bookingPlayerName;
    }

    public Long getBookingTeamId() {
        return bookingTeamId;
    }

    public void setBookingTeamId(Long bookingTeamId) {
        this.bookingTeamId = bookingTeamId;
    }

    public Integer getBookingType() {
        return bookingType;
    }

    public void setBookingType(Integer bookingType) {
        this.bookingType = bookingType;
    }

    public Integer getBookingMinute() {
        return bookingMinute;
    }

    public void setBookingMinute(Integer bookingMinute) {
        this.bookingMinute = bookingMinute;
    }

    public Integer getMatchPart() {
        return matchPart;
    }

    public void setMatchPart(Integer matchPart) {
        this.matchPart = matchPart;
    }
}
