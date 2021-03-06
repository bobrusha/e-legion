package com.elegion.androidschool;

/**
 * Specifies an area in a coordinate space that is enclosed by (x1, y1,) and (x2, y2) points.
 *
 * @author Bobrova Aleksandra
 */
public class Rectangle {
    /**
     * x1, y1 - bottom left angle
     */
    private final int x1;
    private final int y1;
    /**
     * x2, y2 - top right angle
     */
    private final int x2;
    private final int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = Math.min(x1, x2);
        this.y1 = Math.min(y1, y2);
        this.x2 = Math.max(x1, x2);
        this.y2 = Math.max(y1, y2);
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
}
