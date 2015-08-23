package com.elegion.androidschool;

/**
 * Created by Aleksandra on 20.08.15.
 */
public enum PointType {
    OPENING(1),
    CLOSING(-1);

    private final int value;

    PointType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
