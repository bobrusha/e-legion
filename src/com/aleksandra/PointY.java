package com.aleksandra;

import com.sun.istack.internal.NotNull;

/**
 * Created by Aleksandra on 20.08.15.
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

    public int getValueOfType() {
        if (type == PointType.OPENING)
            return 1;
        else
            return -1;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        //TODO: read oracle recommendations
        PointY that = (PointY) o;

        return this.y - that.y;
    }
}
