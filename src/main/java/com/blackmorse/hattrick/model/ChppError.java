package com.blackmorse.hattrick.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChppError extends Model {
    @JacksonXmlProperty(localName = "Error")
    private String error;
    @JacksonXmlProperty(localName = "ErrorCode")
    private Integer errorCode;
    @JacksonXmlProperty(localName = "ErrorGUID")
    private String errorGUID;
    @JacksonXmlProperty(localName = "Server")
    private String server;
    @JacksonXmlProperty(localName = "Request")
    private String request;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorGUID() {
        return errorGUID;
    }

    public void setErrorGUID(String errorGUID) {
        this.errorGUID = errorGUID;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    @Override
    public String toString() {
        return "ChppError{" +
                "error='" + error + '\'' +
                ", errorCode=" + errorCode +
                ", errorGUID='" + errorGUID + '\'' +
                ", server='" + server + '\'' +
                ", request='" + request + '\'' +
                '}';
    }
}
