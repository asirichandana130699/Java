package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class SwapTest {

    Swap swap = new Swap();
    @Test
    public void testSwap() {
        Assert.assertArrayEquals(new int[]{12, 15}, swap.swappingWithOutThird(15, 12));
    }

}
