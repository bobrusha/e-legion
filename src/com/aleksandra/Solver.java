package com.aleksandra;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Solver {

    public static int calculateArea(List<Rectangle> aRectangle) {

        Collections.sort(aRectangle);
        System.out.println(aRectangle);

        ArrayDeque<Rectangle> queue = new ArrayDeque<>(aRectangle);

        return 0;
    }

}
