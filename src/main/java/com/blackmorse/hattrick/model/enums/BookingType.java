package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BookingType implements HattrickType {
    YELLOW_CARD(1),
    RED_CARD(2);

    private int value;

    BookingType(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;
    }
}
