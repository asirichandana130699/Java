package streams;

import org.junit.Assert;
import org.junit.Test;

public class AverageOfSquaresTest {
    AverageOfSquares averageOfSquares = new AverageOfSquares();
    @Test
    public void testAverage() {
        Assert.assertEquals(5.0, averageOfSquares.findAverageOfSquaresOfOdds(new int[]{1, 2, 3}), 0.01);
    }
}
