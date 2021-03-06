package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum InjuryType implements HattrickType {
    BRUISED(1),
    INJURY(2);

    private int value;

    InjuryType(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;

    }
}