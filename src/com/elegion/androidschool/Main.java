package com.elegion.androidschool;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Bobrova Aleksandra
 */
public class Main {

    public static void main(String args[]) throws NotEnoughArgumentsException {
        if (args.length < 2) {
            throw new NotEnoughArgumentsException("Not enough arguments in main()");
        }
        String input = args[0];
        String output = args[1];
        BufferedWriter writer = null;
        try {
            int result = Solver.calculateArea(new Parser().parse(input));

            writer = new BufferedWriter(new FileWriter(output));
            writer.write("" + result);
            writer.flush();
        } catch (IOException | NotCorrectInputFormatException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
