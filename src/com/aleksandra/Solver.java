package com.aleksandra;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Solver {
    //TODO: replace arrX,
    public static int calculateArea(ArrayList<Rectangle> rectangles) {
        ArrayList<Integer> arrX = new ArrayList<>(rectangles.size() * 2);
        ArrayList<PointY> arrY = new ArrayList<>(rectangles.size() * 2);
        for (Rectangle r: rectangles ) {
            arrX.add(r.getX1());
            arrX.add(r.getX2());
            arrY.add(new PointY(r.getY1(), r.getX1(), r.getX2(), PointType.OPENING));
            arrY.add(new PointY(r.getY2(), r.getX1(), r.getX2(), PointType.CLOSING));
        }

        Collections.sort(arrX);
        Collections.sort(arrY);

        int result = 0;
        for (int i = 1; i < arrX.size(); ++i) {
            int length = arrX.get(i) - arrX.get(i - 1);
            int cnt = 0;
            int start = 0;
            for (PointY pointY : arrY) {
                if (pointY.getLeftX() >= arrX.get(i) || pointY.getRightX() <= arrX.get(i - 1))
                    continue;
                if (cnt == 0) {
                    start = pointY.getY();
                }
                cnt += pointY.getValueOfType();
                if (cnt == 0) {
                    result += (pointY.getY() - start) * length;
                }
            }
        }
        return result;
    }
}
