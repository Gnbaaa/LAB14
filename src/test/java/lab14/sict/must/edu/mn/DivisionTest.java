package lab14.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void testDividePositiveNumbers() {
        Division calc = new Division();
        double result = calc.divide(6.0, 3.0);
        assertEquals(2.0, result);
    }

    @Test
    void testDivideNegativeNumbers() {
        Division calc = new Division();
        double result = calc.divide(-6.0, 3.0);
        assertEquals(-2.0, result);
    }

    @Test
    void testDivideByZeroThrowsException() {
        Division calc = new Division();
        assertThrows(IllegalArgumentException.class,
                () -> calc.divide(4.0, 0.0));
    }
}
