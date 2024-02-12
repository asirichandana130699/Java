package thread;

import org.junit.Assert;
import org.junit.Test;

public class OddEvenPrinterTest {
    OddEvenPrinter evenOrOdd = new OddEvenPrinter();
    @Test
    public void testEvenOrOdd() {
        Assert.assertEquals(4, (int) evenOrOdd.getEvenOdd(10)
                .get(3));
    }
}
