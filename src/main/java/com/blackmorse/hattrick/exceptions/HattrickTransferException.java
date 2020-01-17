package com.blackmorse.hattrick.exceptions;

public class HattrickTransferException extends RuntimeException {
    public HattrickTransferException(Exception e) {
        super(e);
    }
}
