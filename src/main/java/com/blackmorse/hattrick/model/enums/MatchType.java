package com.blackmorse.hattrick.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MatchType implements HattrickType {
    LEAGUE_MATCH(1),
    QUALIFICATION_MATCH(2),
    CUP_MATCH(3),
    FRIENDLY_NORMAL(4),
    FRIENDLY_CUP(5),
    HATTRICK_MASTERS(7),
    INTERNATIONAL_FRIENDLY_NORMAL(8),
    INTERNATIONAL_FRIENDLY_CUP(9),
    NATIONAL_TEAMS_NORMAL(10),
    NATIONAL_TEAMS_CUP(11),
    NATIONAL_TEAMS_FRIENDLY(12),
    TOURNAMENT_LEAGUE(50),
    TOURNAMENT_PLAYOFF(51),
    SINGLE_MATCH(61),
    LADDER_MATCH(62),
    PREPARATION_MATCH(80),
    YOUTH_LEAGUE(100),
    YOUTH_FRIENDLY(101),
    YOUTH_FRIENDLY_CUP(103),
    YOUTH_INTERNATIONAL_FRIENDLY(105),
    YOUTH_INTERNATIONAL_FRIENDLY_CUP(106);

    private int value;

    MatchType(int value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public int getValue() {
        return value;
    }
}
