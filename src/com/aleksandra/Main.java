package com.aleksandra;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Aleksandra on 18.08.15.
 */
public class Main {
    public static void main(String args[]) {

        String input = args[0];
        String output = args[1];


        BufferedWriter writer = null;

        try {
            Rectangle[] arr = Parser.parse(input);
            System.out.println(Arrays.deepToString(arr));
            int result = Solver.calculateArea(arr);

            writer = new BufferedWriter(new FileWriter(output));
            writer.write("" + result);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
