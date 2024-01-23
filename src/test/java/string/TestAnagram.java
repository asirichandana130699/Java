package string;

import org.junit.Assert;
import org.junit.Test;

public class TestAnagram {
    @Test
    public void testStringAnagrams() {
        Anagram anagrams = new Anagram();
        boolean isAnagram = anagrams.areAnagrams("siri", "iris");
        Assert.assertTrue(isAnagram);
    }


    @Test
    public void testStringAnagrams_Failure() {
        Anagram anagrams = new Anagram();
        boolean isAnagram = anagrams.areAnagrams("siri", "irisa");
        Assert.assertFalse(isAnagram);
    }
}
