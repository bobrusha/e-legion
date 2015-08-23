import com.elegion.androidschool.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

/**
 * Created by Aleksandra on 19.08.15.
 */
public class CalculateAreaMethodTest extends Assert {

    @Test
    public void testNumber1() throws Exception {
        final String[] arguments = {"txt/input1.txt", "txt/output.txt"};
        Main.main(arguments);

        StringTokenizer stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output.txt")).readLine());
        final int actual = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output1.txt")).readLine());
        final int expected = Integer.parseInt(stringTokenizer.nextToken());

        assertEquals(actual, expected);
    }

    @Test
    public void testNumber2() throws Exception {
        final String[] arguments = {"txt/input2.txt", "txt/output.txt"};
        Main.main(arguments);

        StringTokenizer stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output.txt")).readLine());
        final int actual = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output2.txt")).readLine());
        final int expected = Integer.parseInt(stringTokenizer.nextToken());

        assertEquals(actual, expected);
    }

    @Test
    public void testNumber3() throws Exception {
        final String[] arguments = {"txt/input3.txt", "txt/output.txt"};
        Main.main(arguments);

        StringTokenizer stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output.txt")).readLine());
        final int actual = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output3.txt")).readLine());
        final int expected = Integer.parseInt(stringTokenizer.nextToken());

        assertEquals(expected, actual);
    }


    @Test
    public void testNumber4() throws Exception {
        final String[] arguments = {"txt/input4.txt", "txt/output.txt"};
        Main.main(arguments);

        StringTokenizer stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output.txt")).readLine());
        final int actual = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output4.txt")).readLine());
        final int expected = Integer.parseInt(stringTokenizer.nextToken());

        assertEquals(expected, actual);
    }

    @Test
    public void testNumber5() throws Exception {
        final String[] arguments = {"txt/input5.txt", "txt/output.txt"};
        Main.main(arguments);

        StringTokenizer stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output.txt")).readLine());
        final int actual = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(new BufferedReader(new FileReader("txt/output5.txt")).readLine());
        final int expected = Integer.parseInt(stringTokenizer.nextToken());

        assertEquals(expected, actual);
    }
}
