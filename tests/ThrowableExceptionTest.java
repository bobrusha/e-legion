import com.aleksandra.Main;
import com.aleksandra.NotCorrectInputFormatException;
import com.aleksandra.NotEnoughArgumentsException;
import com.aleksandra.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class ThrowableExceptionTest extends Assert {

    @Test(expected = FileNotFoundException.class)
    public void testInputFileDoesNotExist() throws Exception {
        String input = "sasha.txt";
        Parser p = new Parser();
        p.parse(input);
    }

    @Test(expected = NotCorrectInputFormatException.class)
    public void testNotCorrectInputFormat() throws Exception {
        String input = "txt/ex_input1.txt";
        Parser p = new Parser();
        p.parse(input);
    }

    @Test(expected = NotCorrectInputFormatException.class)
    public void testTooMuchLines() throws Exception {
        String input = "txt/ex_input2.txt";
        Parser p = new Parser();
        p.parse(input);
    }

    @Test(expected = NotEnoughArgumentsException.class)
    public void testNotEnoughArguments() throws Exception {
        String[] arguments = {"input1.txt"};
        Main.main(arguments);
    }
}
