package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorWith2() {
        String result = new Mirror().mirrorEnds("abXYZba");
        Assertions.assertEquals("ab", result);
    }

    @Test
    public void mirrorWith1() {
        String result = new Mirror().mirrorEnds("abca");
        Assertions.assertEquals("a", result);
    }

    @Test
    public void mirrorWith3() {
        String result = new Mirror().mirrorEnds("aba");
        Assertions.assertEquals("aba", result);
    }

    @Test
    public void mirrorOK() {
        String result = new Mirror().mirrorEnds("abccba");
        Assertions.assertEquals("abc", result);
    }

    @Test
    public void mirrorNotOK() {
        String result = new Mirror().mirrorEnds("abcba");
        Assertions.assertEquals("ab",result);
    }

    @Test
    public void mirrorOneChar() {
        String result = new Mirror().mirrorEnds("a");
        Assertions.assertEquals("a",result);
    }

    @Test
    public void mirrorNone() {
        String result = new Mirror().mirrorEnds("ab");
        Assertions.assertEquals("",result);
    }
}