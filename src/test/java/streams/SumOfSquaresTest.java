package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SumOfSquaresTest {
    SumOfSquares sum = new SumOfSquares();
    @Test
    public void testSum() {
        Assert.assertEquals(30, sum.getSumOfSquares(List.of(1, 2, 3, 4)));
    }
}
