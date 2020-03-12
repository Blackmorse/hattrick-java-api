package com.blackmorse.hattrick.api.worlddetails.model;

import com.blackmorse.hattrick.common.DoubleDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @JacksonXmlProperty(localName = "CountryID")
    private Integer countryId;
    @JacksonXmlProperty(localName = "CountryName")
    private String countryName;
    @JacksonXmlProperty(localName = "CurrencyName")
    private String currencyName;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JacksonXmlProperty(localName = "CurrencyRate")
    private Double currencyRate;
    @JacksonXmlProperty(localName = "CountryCode")
    private String countryCode;
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

    public Double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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
