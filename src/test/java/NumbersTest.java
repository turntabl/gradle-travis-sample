import io.turntabl.Numbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void testLessThanZero() {
        System.out.println("Running the first test");
        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(-1);
        assertFalse(result);
    }

    @Test
    public void testZero() {
        System.out.println("==============Test Zero===========");

        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(0);
        assertFalse(result);
    }

    @Test
    public void testGreaterThanZero() {
        System.out.println("==============testGreaterThanZero===========");

        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(1);
        assertTrue(result);
    }

    @Test
    public void testLessThanAThousand() {
        System.out.println("==============testLessThanAThousand===========");

        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(999);
        assertTrue(result);
    }

    @Test
    public void testAThousand() {
        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(1000);
        assertFalse(result);
    }

    @Test
    public void testGreaterThanAThousand() {
        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(1001);
        assertFalse(result);
    }
}