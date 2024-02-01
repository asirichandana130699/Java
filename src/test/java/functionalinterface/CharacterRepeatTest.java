package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CharacterRepeatTest {
    CharactersRepeat charactersRepeat = new CharactersRepeat();
    @Test
    public void testCharacterRepeat() {
        ArrayList<Character> arrayList = new ArrayList<>(Arrays.asList('i'));
        Assert.assertEquals(arrayList, charactersRepeat.getRepeatedCharacters("siri"));
    }
}
