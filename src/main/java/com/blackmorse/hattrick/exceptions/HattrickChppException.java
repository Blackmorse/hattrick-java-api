package com.blackmorse.hattrick.exceptions;

import com.blackmorse.hattrick.model.ChppError;

public class HattrickChppException extends RuntimeException {
    private final ChppError chppError;

    public HattrickChppException(ChppError chppError) {
        super(chppError.getError());
        this.chppError = chppError;
    }

    public ChppError getChppError() {
        return chppError;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + chppError.toString();
    }
}
