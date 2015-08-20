package com.aleksandra;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class Segment {
    int beginning;
    int end;

    public Segment(int beginning, int end) {
        this.beginning = beginning;
        this.end = end;
    }

    public boolean contains (int b, int e) {
        return this.beginning <= b && e <= this.end;
    }
}
