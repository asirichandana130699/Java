package exception;

import org.junit.Assert;
import org.junit.Test;

public class ConvertTest {
    Convert convert = new Convert();
    @Test
    public void testConversion() {
        Assert.assertEquals(2, convert.convertString("2"));
    }
    @Test
    public void testConversionOverException() {
        Exception exception = Assert.assertThrows(NumberFormatException.class,
                () -> convert.convertString("1.8"));
        Assert.assertEquals(exception.getMessage(), "Not an integer");
    }
}
