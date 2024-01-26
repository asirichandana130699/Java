package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class DistinctCharacterTest {
    DistinctCharacter distinctCharacter = new DistinctCharacter();
    @Test
    public void testGetCount() {
        HashMap<Character, Integer> characterIntegerHashMap =
                distinctCharacter.getCountOfCharacters("test string");

        Assert.assertEquals(3, characterIntegerHashMap.get('t').intValue());
        Assert.assertEquals(2, characterIntegerHashMap.get('s').intValue());
        //Wrong expected value check
        Assert.assertNotEquals(4, characterIntegerHashMap.get('g').intValue());

    }

}
