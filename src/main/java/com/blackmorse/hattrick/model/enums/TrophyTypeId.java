package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TrophyTypeId implements HattrickType {
    CUPS_WIN(16),
    SERIES_WIN(17),
    HATTRICK_MASTERS_WIN(91),
    HATTRICK_MASTERS_TOP_SCORER(93),
    TOURNAMENT_WINNER(103),
    STUDY_TOURNNAMENT(203);

    private final int value;

    TrophyTypeId(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;
    }
}
