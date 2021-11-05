package io.turntabl;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersTest {

    @Test
    public void testLessThanZero() {
        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(-1);
        assertFalse(result);
    }

    @Test
    public void testZero() {
        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(0);
        assertFalse(result);
    }

    @Test
    public void testGreaterThanZero() {
        boolean result = Numbers.isGreaterThanZeroAndLessThanAThousand(1);
        assertTrue(result);
    }

    @Test
    public void testLessThanAThousand() {
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