import org.junit.Test;

import static org.junit.Assert.*;

public class MommifyTest {

    @Test
    public void shouldExchangeASingleVowel() {
        assertEquals( "mommy", new Mommify().replace("a"));
    }

    @Test
    public void shouldExchangeASingleVowelInAString(){
        assertEquals("hmommys",new Mommify().replace("his"));
    }

    @Test
    public void shouldNotExchangeForNoVowels(){
        assertEquals("qwrt",new Mommify().replace("qwrt"));
    }

    @Test
    public void shouldNotExchangeForConsecutiveVowels() {
        assertEquals("hmommyr", new Mommify().replace("hear"));
    }

    @Test
    public void shouldExchangeForEachSetOfVowels(){
        assertEquals("hmommyrmommyr",new Mommify().replace("hearear"));
    }

    @Test
    public void shouldNotExchangeWhenVowelsIsLesserOrEqualTo30percent(){
        assertEquals("aaabbbbbbb",new Mommify().replace("aaabbbbbbb"));
    }

    @Test
    public void shouldExchangeWhenVowelsIsGreaterThan30percent() {
        assertEquals("wmommyn",new Mommify().replace("ween"));
    }
}