import org.example.Main;
import java.util.Optional;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void test_PositiveSquareRoot() {
        assertEquals(7.0, Main.findSquareRoot(49.0), 0.0001);
    }

    @Test
    public void test_NegativeSquareRoot() {
        assertTrue(Double.isNaN(Main.findSquareRoot(-49.0)));
    }

    // Test for factorial method
    @Test
    public void test_PositiveFactorial() {
        assertEquals(24.0, Main.computeFactorial(4), 0.0001);
    }

    @Test
    public void test_NegativeFactorial() {
        assertEquals(Optional.ofNullable(Main.computeFactorial(-10)), Optional.of(-1));
    }

    // Test for natural_log method
    @Test
    public void test_PositiveLog() {
        assertEquals(Math.log(10), Main.calculateLog(10.0), 0.0001);
    }

    @Test
    public void test_NonPositiveLog() {
        assertTrue(Double.isNaN(Main.calculateLog(0.0)));
    }

    // Test for exponent method
    @Test
    public void test_PositiveExponent() {
        assertEquals(8.0, Main.raiseToPower(2.0, 3.0), 0.0001);
    }

    @Test
    public void test_ExponentZero() {
        assertEquals(1.0, Main.raiseToPower(5.0, 0.0), 0.0001);
    }
}
