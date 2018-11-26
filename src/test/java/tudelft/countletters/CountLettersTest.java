package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|tiger");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("tiger|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void firstWordDoesNotMatch() {
        int words = new CountLetters().count("cat|dogs");
        Assertions.assertEquals(1, words);
    }

    /**@Test
    public void noMatchingWord() {
        int words = new CountLetters().count("cat|dog");
        Assertions.assertEquals(0, words);
    }*/

    /**@Test
    public void emptyString() {
        int words = new CountLetters().count("");
        Assertions.assertEquals(0, words);
    }*/

}