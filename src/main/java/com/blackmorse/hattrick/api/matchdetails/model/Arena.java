package com.blackmorse.hattrick.api.matchdetails.model;

import com.blackmorse.hattrick.model.enums.WeatherId;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Arena {
    @JacksonXmlProperty(localName = "ArenaID")
    private Long arendId;
    @JacksonXmlProperty(localName = "ArenaName")
    private String arenaName;
    @JacksonXmlProperty(localName = "WeatherID")
    private WeatherId weatherId;
    @JacksonXmlProperty(localName = "SoldTotal")
    private Integer soldTotal;
    @JacksonXmlProperty(localName = "SoldTerraces")
    private Integer soldTerraces;
    @JacksonXmlProperty(localName = "SoldBasic")
    private Integer soldBasic;
    @JacksonXmlProperty(localName = "SoldRoof")
    private Integer soldRoof;
    @JacksonXmlProperty(localName = "SoldVIP")
    private Integer soldVip;

    public Long getArendId() {
        return arendId;
    }

    public String getArenaName() {
        return arenaName;
    }

    public WeatherId getWeatherId() {
        return weatherId;
    }

    public Integer getSoldTotal() {
        return soldTotal;
    }

    public Integer getSoldTerraces() {
        return soldTerraces;
    }

    public Integer getSoldBasic() {
        return soldBasic;
    }

    public Integer getSoldRoof() {
        return soldRoof;
    }

    public Integer getSoldVip() {
        return soldVip;
    }
}