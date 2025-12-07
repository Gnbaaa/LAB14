package lab14.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    void testMultiplyPositiveNumbers() {
        Multiplication calc = new Multiplication();
        double result = calc.multiply(2.0, 3.0);
        assertEquals(6.0, result);
    }

    @Test
    void testMultiplyWithNegativeNumber() {
        Multiplication calc = new Multiplication();
        double result = calc.multiply(-2.0, 3.0);
        assertEquals(-6.0, result);
    }
}
