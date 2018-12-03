package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void singleDigit() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
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
        int result = roman.convert("MCVI");
        Assertions.assertEquals(1106, result);
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

    @Test
    public void invalidNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("IIII");
        Assertions.assertEquals(-1, result);
    }
}
