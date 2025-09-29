package se327;

import org.junit.jupiter.api.Test;
import se.se327.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(5, 4));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(4, 2), 0.01);
    }

    @Test
    void testDivideByZeroThrowsException() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(5, 0),
                "Expected divide(5, 0) to throw IllegalArgumentException");
    }
}
