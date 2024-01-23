package string;

import org.junit.Assert;
import org.junit.Test;

public class TestReverseWord {
    @Test
    public void testReverseWord() {
        ReverseWord reverseWord = new ReverseWord();
        String reverse = reverseWord.checkReverseOfEachWord("Java J2EE Reverse Me");
        Assert.assertEquals("avaJ EE2J esreveR eM", reverse);
    }
}
