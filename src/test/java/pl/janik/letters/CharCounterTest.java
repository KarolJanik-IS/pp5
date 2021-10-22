package pl.janik.letters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class CharCounterTest {
    @Test
    public void itCountsCharsInInputString(){
        //A
        String inputString = "Ala ma kota";
        CharCounter charCounter = new CharCounter();
        //A
        int charCount = charCounter.count('a', inputString);
        //A
        assertEquals(4,charCount);
    }

}
