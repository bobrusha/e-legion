package com.aleksandra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Aleksandra on 19.08.15.
 */
public class Parser {

    public static Rectangle[] parse(String inputFileName) throws IOException {
        BufferedReader reader;

        reader = new BufferedReader(new FileReader(inputFileName));

        ArrayList<Rectangle> rectangles = new ArrayList<>();
        StringTokenizer tokenizer;
        String line;

        while ((line = reader.readLine()) != null) {
            tokenizer = new StringTokenizer(line);
            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());

            rectangles.add(new Rectangle(x1, y1, x2, y2));
        }
        Rectangle[] arr = new Rectangle[rectangles.size()];
        rectangles.toArray(arr);
        return arr;
    }
}
