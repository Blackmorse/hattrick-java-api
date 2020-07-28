package com.blackmorse.hattrick.exceptions;

public class HattrickTransferException extends RuntimeException {
    private final String requestParams;

    public HattrickTransferException(Exception e, String requestParams) {
        super(e);
        this.requestParams = requestParams;
    }

    @Override
    public String toString() {
        return "{" + requestParams + "}, " + super.toString();
    }
}
