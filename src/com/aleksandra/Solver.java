package com.aleksandra;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Solver {
    public static int calculateArea(ArrayList<Integer> arrX, ArrayList<PointY> arrY) {
        Collections.sort(arrX);
        Collections.sort(arrY);

        int result = 0;
        for (int i = 1; i < arrX.size(); ++i) {
            int length = arrX.get(i) - arrX.get(i - 1);
            int cnt = 0;
            int start = 0;
            for (int j = 0; j < arrY.size(); ++j) {
                if (arrY.get(j).getLeftX() >= arrX.get(i) || arrY.get(j).getRightX() <= arrX.get(i - 1))
                    continue;
                if (cnt == 0) {
                    start = arrY.get(j).getY();
                }
                cnt += arrY.get(j).getValueOfType();
                if (cnt == 0) {
                    result += (arrY.get(j).getY() - start) * length;
                }
            }
        }
        return result;
    }
}
