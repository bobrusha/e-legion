package com.elegion.androidschool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Class for reading data from input file and converting it to ArrayList of rectangles.
 *
 * @author Bobrova Aleksandra
 */
public class Parser {
    private static final int COORDINATES_IN_LINE = 4;
    private static final int MAX_VALUE_OF_COORDINATE = 10_000;
    private static final int MAX_NUMBER_OF_LINES_IN_FILE = 100;

    /**
     * Reads coordinates from input file and creates instances of Rectangle if format of input data is correct.
     *
     * @param inputFileName name of input file
     * @return ArrayList contains instances of class Rectangle
     * @throws NotCorrectInputFormatException
     * @throws IOException
     */
    public ArrayList<Rectangle> parse(String inputFileName) throws NotCorrectInputFormatException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));

        StringTokenizer tokenizer;
        String line;
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        int lineCounter = 0;

        while ((line = reader.readLine()) != null) {
            if (++lineCounter > MAX_NUMBER_OF_LINES_IN_FILE) {
                reader.close();
                throw new NotCorrectInputFormatException("File \"" + inputFileName + "\" contains more than 100 lines");
            }
            tokenizer = new StringTokenizer(line);
            if (tokenizer.countTokens() != COORDINATES_IN_LINE) {
                reader.close();
                throw new NotCorrectInputFormatException("Line №" + lineCounter + " doesn't contain four numbers");
            }
            int x1 = Integer.parseInt(tokenizer.nextToken());
            int y1 = Integer.parseInt(tokenizer.nextToken());
            int x2 = Integer.parseInt(tokenizer.nextToken());
            int y2 = Integer.parseInt(tokenizer.nextToken());
            if (Math.abs(x1) > MAX_VALUE_OF_COORDINATE ||
                    Math.abs(x2) > MAX_VALUE_OF_COORDINATE ||
                    Math.abs(y1) > MAX_VALUE_OF_COORDINATE ||
                    Math.abs(y2) > MAX_VALUE_OF_COORDINATE) {
                reader.close();
                throw new NotCorrectInputFormatException("Line №" + lineCounter +
                        " has number(s) more than 10000 or less than -10000.");
            }
            rectangles.add(new Rectangle(x1, y1, x2, y2));
        }
        reader.close();
        return rectangles;
    }
}
