package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class ArraySumCalculatorTest {

    @Test
    public void testSumArrayWithPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        Assert.assertEquals(expectedSum, ArraySumCalculator.sumArray(array));
    }

    @Test
    public void testSumArrayWithSingleElement() {
        int[] array = {5};
        int expectedSum = 5;
        Assert.assertEquals(expectedSum, ArraySumCalculator.sumArray(array));
    }
}
