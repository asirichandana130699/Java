package string;

import org.junit.Assert;
import org.junit.Test;

public class TestVowelCount {
    VowelCount vowelCount = new VowelCount();
    @Test
    public void testCountSuccess() {
        int count = vowelCount.countVowels("Hello, how are you doing today?");
        Assert.assertEquals(11, count);
    }
}
