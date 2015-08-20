package com.aleksandra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * Created by Aleksandra on 19.08.15.
 */
public class Parser {
    private LinkedList<Integer> listX = new LinkedList<>();
    private LinkedList<PointY> listY = new LinkedList<>();

    public void parse(String inputFileName) throws IOException {
        BufferedReader reader;

        reader = new BufferedReader(new FileReader(inputFileName));

        StringTokenizer tokenizer;
        String line;

        while ((line = reader.readLine()) != null) {
            tokenizer = new StringTokenizer(line);
            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());

            listX.add(x1);
            listX.add(x2);
            listY.add(new PointY(y1, x1, x2, PointType.OPENING));
            listY.add(new PointY(y2, x1, x2, PointType.CLOSING));
        }
    }

    public ArrayList<Integer> getListX() {
        return new ArrayList<Integer>(listX);
    }

    public ArrayList<PointY> getListY() {
        return new ArrayList<>(listY);
    }
}
