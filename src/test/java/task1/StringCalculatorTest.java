package task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Test
    public void shouldAnswerWithTrue() {

        // 1
        assertEquals(0, StringCalculator.add(""));
        assertEquals(1, StringCalculator.add("1"));
        assertEquals(3, StringCalculator.add("1,2"));

        assertEquals(10, StringCalculator.add("asd,10,0"));
        assertEquals(10, StringCalculator.add("asd,1,,,9,,,,0"));
        assertEquals(10, StringCalculator.add(",,///,..,01,,asd,,08,01"));
        assertEquals(10, StringCalculator.add("asd,1,2,2,,,5,0"));
        assertEquals(0, StringCalculator.add("0,10asd,,,0,000,0,0"));


        // 2
        assertEquals(6, StringCalculator.add("1\n2,3"));

        assertEquals(10, StringCalculator.add("asd,10,\n0"));
        assertEquals(10, StringCalculator.add("\nasd,1,,\n\n,\n9,,,,0\n"));
        assertEquals(10, StringCalculator.add(",,///,..,\n01\n,,asd,,08,01"));
        assertEquals(10, StringCalculator.add("asd,1,2,\n\n\n2,,,5,0"));
        assertEquals(0, StringCalculator.add("0,10asd,\n\n,,\n0,0\n00,0,0"));


        //3
        assertEquals(3, StringCalculator.add("//;\n1;2" ));

        assertEquals(3, StringCalculator.add("//!\n1!2" ));
        assertEquals(3, StringCalculator.add("//$$\n1$$2" ));
        assertEquals(6, StringCalculator.add("//$$\n1$$2\n\n3" ));
        assertEquals(6, StringCalculator.add("//$$\n1$$2,,,$$\n3" ));


        //4
        

    }
}
