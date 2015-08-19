import com.aleksandra.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Aleksandra on 19.08.15.
 */
public class InstersectsMethodTest extends Assert {
    @Test
    public void testCrossRectangles() throws Exception {
        final Rectangle r1 = new Rectangle(7, 2, 12, 12);
        final Rectangle r2 = new Rectangle(2, 5, 17, 10);

        final boolean expected = true;
        final boolean actual = r1.intersects(r2);
        assertEquals(expected, actual);

    }

    @Test
    public void testRectangleContainsRectangle() throws Exception {
        final Rectangle r1 = new Rectangle(1, 1, 8, 9);
        final Rectangle r2 = new Rectangle(2, 2, 8, 9);

        final boolean expected = true;
        final boolean actual = r1.intersects(r2);
        assertEquals(expected, actual);
    }

    @Test
    public void testRightUpperIntersection() throws Exception {

        final Rectangle r1 = new Rectangle(1, 1, 8, 8);
        final Rectangle r2 = new Rectangle(5, 5, 10, 10);

        final boolean expected = true;
        final boolean actual = r1.intersects(r2);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoIntersection() throws Exception {

        final Rectangle r1 = new Rectangle(1, 1, 3, 3);
        final Rectangle r2 = new Rectangle(1, 3, 3, 9);

        final boolean expected = false;
        final boolean actual = r1.intersects(r2);
        assertEquals(expected, actual);

    }
}
