package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum WeatherId implements HattrickType {
    RAIN(0),
    OVERCAST(1),
    PARTIALLY_CLOUDY(2),
    SUNNY(3);

    private final int value;

    WeatherId(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;
    }
}
