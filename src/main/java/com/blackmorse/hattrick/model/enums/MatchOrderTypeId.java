package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MatchOrderTypeId implements HattrickType {
    NORMAL_BEHAVIOUR(1),
    PLAYER_SWAP(3);

    private int value;

    MatchOrderTypeId(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;
    }
}
