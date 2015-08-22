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
    private static final int COORDINATES_IN_LINE = 4;

    public ArrayList<Rectangle> parse(String inputFileName) throws IOException {
        BufferedReader reader;

        reader = new BufferedReader(new FileReader(inputFileName));

        StringTokenizer tokenizer;
        String line;
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            //TODO: write checking: input contains <= 100 lines
            tokenizer = new StringTokenizer(line);
            // TODO: check line below
            if (tokenizer.countTokens() != COORDINATES_IN_LINE)
                throw new IllegalArgumentException("Not correct format of input data.");

            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());
            //TODO: Math.min() and Math.max() ??
            rectangles.add(new Rectangle(x1, y1, x2, y2));
        }
        return rectangles;
    }
}
