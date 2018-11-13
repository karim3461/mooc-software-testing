package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    @Test
    public void noHappySingleG() {
        boolean result = new GHappy().gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void noHappyMultipleG() {
        boolean result = new GHappy().gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void singleHappyG() {
        boolean result = new GHappy().gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void multipleHappyG() {
        boolean result = new GHappy().gHappy("xxggyyggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void noHappyCharInput() {       //Failed before bug fix
        boolean result = new GHappy().gHappy("g");
        Assertions.assertFalse(result);
    }

    @Test
    public void noHappyShortInput() {
        boolean result = new GHappy().gHappy("xg");
        Assertions.assertFalse(result);
    }

    @Test
    public void noHappyShortInput2() {        //Failed before bug fix
        boolean result = new GHappy().gHappy("gx");
        Assertions.assertFalse(result);
    }

    @Test
    public void happyShortInput() {        //Failed before bug fix
        boolean result = new GHappy().gHappy("gg");
        Assertions.assertTrue(result);
    }
}
