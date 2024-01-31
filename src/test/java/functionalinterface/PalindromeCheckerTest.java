package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeCheckerTest {

    PalindromeChecker palindromeChecker = new PalindromeChecker();
    @Test
    public void testPalindrome() {
        Assert.assertTrue(palindromeChecker.isPalindrome(1221));
        Assert.assertFalse(palindromeChecker.isPalindrome(12));
        Assert.assertFalse(palindromeChecker.isPalindrome(-12));
    }
}
