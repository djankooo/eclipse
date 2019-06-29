package task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(10, StringCalculator.add("asd,10,0"));
        assertEquals(10, StringCalculator.add("asd,1,,,9,,,,0"));
        assertEquals(10, StringCalculator.add(",,///,..,01,,asd,,08,01"));
        assertEquals(0, StringCalculator.add("asd,1,2,2,,,5,0"));
        assertEquals(0, StringCalculator.add("asd,,0,0"));
    }
}
