package com.elegion.androidschool;

/**
 * Type of point y: opening or closing.
 *
 * @author Bobrova Aleksandra
 */
public enum PointType {
    OPENING(-1),
    CLOSING(1);

    private final int value;

    PointType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
