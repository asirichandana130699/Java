package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class CaseConverterTest {

    @Test
    public void testConvertCaseWithMixedCase() {
        String input = "Hello World!";
        String expected = "hELLO wORLD!";
        Assert.assertEquals(expected, CaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseWithAllUpperCase() {
        String input = "JAVA";
        String expected = "java";
        Assert.assertEquals(expected, CaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseWithAllLowerCase() {
        String input = "hello";
        String expected = "HELLO";
        Assert.assertEquals(expected, CaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseWithNonAlphabeticCharacters() {
        String input = "12345!";
        String expected = "12345!";
        Assert.assertEquals(expected, CaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseWithEmptyString() {
        String input = "";
        String expected = "";
        Assert.assertEquals(expected, CaseConverter.convertCase(input));
    }

    @Test
    public void testConvertCaseWithNull() {
        Assert.assertNull(CaseConverter.convertCase(null));
    }
}
