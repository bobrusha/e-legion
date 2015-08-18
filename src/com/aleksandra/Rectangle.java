package com.aleksandra;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Rectangle implements Comparable {
    // left down
    int x1;
    int y1;

    //right top
    int x2;
    int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Calculates area of rectangle as a multiplication of two sides.
     *
     * @return area of rectangle
     */
    public int calculateArea() {
        return Math.abs((x1 - x2) * (y1 - y2));
    }

    @Override
    public int compareTo(Object o) {
        //Oracle recommendation
        if (o == null)
            throw new NullPointerException();

        Rectangle that = (Rectangle) o;

        if (this.x1 == that.x2) {
            if (this.x2 == that.x2)
                return 0;
            else return this.x2 - that.x2;
        }

        return this.x1 - that.x1;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }
}
