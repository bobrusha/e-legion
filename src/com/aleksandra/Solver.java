package com.aleksandra;

import java.util.Arrays;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Solver {
    public static int calculateArea(Rectangle[] aRectangle) {

        Arrays.sort(aRectangle);
        System.out.println(Arrays.deepToString(aRectangle));

        Rectangle head;
        Rectangle runner;

        //TODO: int maybe small
        int result = 0;

        for (int i = 0; i < aRectangle.length; ++i) {
            result += aRectangle[i].calculateArea();
            int j = i + 1;
            while (j < aRectangle.length && aRectangle[j].getX1() < aRectangle[i].getX2()) {
                result -= aRectangle[i].getIntersectionArea(aRectangle[j]);
                ++j;
            }
        }
        return result;
    }
}
