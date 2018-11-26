package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CaesarShiftCipherTest {
    @Test
    public void firstTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("abc",3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void secondTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("xyz",3);
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void singleCharTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("f",3);
        Assertions.assertEquals("i", result);
    }

    @Test
    public void nonSequentialCharsTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("gm",3);
        Assertions.assertEquals("jp", result);
    }

    @Test
    public void spaceCharTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("a b",3);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void invalidCharTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("bon6jour",3);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void emptyStringTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("",3);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void bigShiftTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("abc", 28);
        Assertions.assertEquals("cde", result);
    }

    @Test
    public void negativeShiftTest() {
        String result = new CaesarShiftCipher().CaesarShiftCipher("abc", -2);
        Assertions.assertEquals("yza", result);
    }
}
