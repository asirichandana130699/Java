package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class VowelsTest {
    Vowels vowels = new Vowels();
    @Test
    public void testVowels() {
        String[] arr = {"i", "am", "siri", "chandana"};
        Map<String, Integer> map = vowels.getStringsWithVowels(arr);
        Assert.assertEquals(2, (int) map.get("siri"));
    }
}
