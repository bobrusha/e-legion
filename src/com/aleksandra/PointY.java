package com.aleksandra;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class PointY implements Comparable{
    private int y;
    private int leftX;
    private int rightX;
    private PointType type;

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
        //TODO: read oracle recommendations

        if (o == null)
            throw new NullPointerException();

        PointY that = (PointY) o;

        return this.y - that.y;
    }
}
