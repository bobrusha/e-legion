package com.aleksandra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Main {
    public static void main(String args[]) {

        String input = args[0];
        String output = args[1];


        BufferedWriter writer = null;

        try {
            Parser parser = new Parser();
            parser.parse(input);
            int result = Solver.calculateArea(parser.getListX(), parser.getListY());

            writer = new BufferedWriter(new FileWriter(output));
            writer.write("" + result);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    //TODO: добавить проверку количества чисел в исходном файле
}
