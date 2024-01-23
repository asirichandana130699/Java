package string;

import org.junit.Assert;
import org.junit.Test;

public class TestAnagram {
    @Test
    public void testStringAnagrams() {
        Anagram anagrams = new Anagram();
        boolean isAnagram = anagrams.areAnagrams("siva", "avis");
        Assert.assertTrue(isAnagram);
    }


    @Test
    public void testStringAnagrams_Failure() {
        Anagram anagrams = new Anagram();
        boolean isAnagram = anagrams.areAnagrams("shiva", "sivas");
        Assert.assertFalse(isAnagram);
    }
}
