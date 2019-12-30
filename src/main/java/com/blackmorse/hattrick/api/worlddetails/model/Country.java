package com.blackmorse.hattrick.api.worlddetails.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @JacksonXmlProperty(localName = "CountryID")
    private Integer countryId;
    @JacksonXmlProperty(localName = "CountryName")
    private String countryName;
    @JacksonXmlProperty(localName = "CurrencyName")
    private String currencyName;
    @JacksonXmlProperty(localName = "CurrencyRate")
    private String currencyRate;
    @JacksonXmlProperty(localName = "CurrencyCode")
    private String currencyCode;
    @JacksonXmlProperty(localName = "DateFormat")
    private String dateFormat;
    @JacksonXmlProperty(localName = "TimeFormat")
    private String timeFormat;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }
}
