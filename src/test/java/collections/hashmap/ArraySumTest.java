package collections.hashmap;


import org.junit.Assert;
import org.junit.Test;

public class ArraySumTest {
    ArraysSum arraysSum = new ArraysSum();
    @Test
    public void testGetSum() {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] outputArray = {3, 5};
        Assert.assertArrayEquals(outputArray, arraysSum.getSum(arr, target));
        arr = new int[]{10, 20, 30, 40, 50};
        Assert.assertNull(arraysSum.getSum(arr, target));
    }


}
