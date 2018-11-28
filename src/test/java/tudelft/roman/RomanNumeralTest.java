package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleDigit() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("D");
        Assertions.assertEquals(500, result);
    }

    @Test
    public void multipleDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XX");
        Assertions.assertEquals(20, result);
    }

    @Test
    public void numberWithDifferentDigits() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("MCV");
        Assertions.assertEquals(1105, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("CXLII");
        Assertions.assertEquals(142, result);
    }

    /*@Test
    public void invalidNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IIII");
        Assertions.assertEquals("Invalid", result);
    }*/
}
