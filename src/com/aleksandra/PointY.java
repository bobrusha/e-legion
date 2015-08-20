package com.aleksandra;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class PointY implements Comparable{
    int y;
    int leftX;
    int rightX;
    PointType type;

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
    public int compareTo(Object o) {
        if (o == null)
            throw new NullPointerException();
        PointY that = (PointY) o;

        return this.y - that.y;
    }
}
