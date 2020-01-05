package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MatchOrderTypeId {
    NORMAL_BEHAVIOUR(1),
    PLAYER_SWAP(3);

    private int value;

    MatchOrderTypeId(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
