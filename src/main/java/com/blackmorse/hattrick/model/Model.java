package com.blackmorse.hattrick.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Date;

public abstract class Model {
    @JacksonXmlProperty(localName = "FileName")
    private String fileName;
    @JacksonXmlProperty(localName = "Version")
    private String version;
    @JacksonXmlProperty(localName = "UserID")
    private Long userId;
    @JacksonXmlProperty(localName = "FetchedDate")
    private Date fetchedDate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getFetchedDate() {
        return fetchedDate;
    }

    public void setFetchedDate(Date fetchedDate) {
        this.fetchedDate = fetchedDate;
    }
}
