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
        //TODO: add checking right-upper
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Calculates area of rectangle as a multiplication of width and height
     *
     * @return area of rectangle
     */
    public int calculateArea() {
        return Math.abs((x1 - x2) * (y1 - y2));
    }

    public int getIntersectionArea(Rectangle that) {
        if (this.x2 <= that.x1 || this.x1 >= that.x2 || this.y1 >= that.y2 || this.y2 <= that.y1)
            return 0;
        int nx1 = this.x1 > that.x1? this.x1 : that.x1;
        int ny1 = this.y1 > that.y1? this.y1 : that.y1;
        int nx2 = this.x2 < that.x2? this.x2 : that.x2;
        int ny2 = this.y2 < that.y2? this.y2 : that.y2;

        return Math.abs((nx1 - nx2) * (ny1 - ny2));
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

    public boolean contains (Rectangle r) {
        return this.x1 <= r.x1 && this.y1 <= r.x1 && this.x2 >= r.x2 && this.y2 >= r.y2;
    }
    public boolean intersects (Rectangle r) {
        return this.x1 < r.x2 && this.x2 > r.x1 && this.y1 < r.y2 && this.y2 > r.y1;
    }
    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }


}
