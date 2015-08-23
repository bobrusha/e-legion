package com.elegion.androidschool;

import com.sun.istack.internal.NotNull;

/**
 * @author Bobrova Aleksandra
 */
public class PointY implements Comparable {
    private final int y;
    private final int leftX;
    private final int rightX;
    private final PointType type;

    public PointY(int y, int leftX, int rightX, PointType type) {
        this.y = y;
        this.leftX = leftX;
        this.rightX = rightX;
        this.type = type;
    }

    public int getY() {
        return y;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getRightX() {
        return rightX;
    }

    public PointType getType() {
        return type;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        PointY that = (PointY) o;
        if (this.y == that.y)
            return this.type.getValue();
        return this.y - that.y;
    }
}
