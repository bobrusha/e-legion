import com.aleksandra.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * Created by Aleksandra on 20.08.15.
 */
public class ThrowableExceptionTest extends Assert {

    @Test(expected = FileNotFoundException.class)
    public void testNotCorrectInputFileFormat() throws Exception {
        String input = "sasha.txt";
        Parser p = new Parser();
        p.parse(input);
    }

}
