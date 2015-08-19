package com.aleksandra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Main {
    public static void main(String args[]) {

        String input = args[0];
        String output = args[1];

        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(input));

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

            System.out.println(rectangles);

            int result = Solver.calculateArea(rectangles);
            System.out.println(result);

            System.out.println(rectangles.get(0).getIntersectionArea(rectangles.get(1)));
        } catch (FileNotFoundException e) {
            System.out.println("File " + input + "wasn't found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO: добавить проверку количества чисел в исходном файле
}
