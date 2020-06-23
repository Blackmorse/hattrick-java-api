package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SearchType implements HattrickType {
    PLAYERS(0),
    ARENAS(1),
    MANAGERS(2),
    SERIES(3),
    TEAMS(4),
    REGIONS(5),
    MATCH(6);

    private int value;

    SearchType(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;
    }
}
