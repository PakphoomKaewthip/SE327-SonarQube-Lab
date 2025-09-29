package se327;

import org.junit.jupiter.api.Test;
import se.se327.AdvancedCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AdvancedCalculatorTest {

    @Test
    void testPower() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(8.0, calculator.power(2, 3), 0.01);
    }

    @Test
    void testSqrt() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertEquals(2.0, calculator.sqrt(4), 0.01);
        assertEquals(0.0, calculator.sqrt(0), 0.01);
    }

    @Test
    void testSqrtNegativeThrowsException() {
        AdvancedCalculator calculator = new AdvancedCalculator();
        assertThrows(IllegalArgumentException.class,
                () -> calculator.sqrt(-9),
                "Expected sqrt(-9) to throw IllegalArgumentException");
    }
}
