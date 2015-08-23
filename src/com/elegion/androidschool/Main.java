package com.elegion.androidschool;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Main {

    public static void main(String args[]) throws NotEnoughArgumentsException, NotCorrectParameterException {
        if (args.length < 2) {
            throw new NotEnoughArgumentsException("Not enough arguments in main()");
        }

        String input = args[0];
        String output = args[1];

        if (!input.endsWith(".txt")) {
            throw new NotCorrectParameterException("Input file isn't txt-file.");
        }
        if (!output.endsWith(".txt")) {
            throw new NotCorrectParameterException("Output file isn't txt-file.");
        }

        BufferedWriter writer = null;

        try {
            try {
                int result = Solver.calculateArea(new Parser().parse(input));

                writer = new BufferedWriter(new FileWriter(output));
                writer.write("" + result);
                writer.flush();
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (IOException | NotCorrectInputFormatException e) {
            e.printStackTrace();
        }
    }
}
