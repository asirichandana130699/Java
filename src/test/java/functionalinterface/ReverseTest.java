package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseTest {
    Reverse reverse = new Reverse();
    @Test
    public void testReverseArrayList() {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(3, 1, 2, 6, 4));
        ArrayList<Integer> outputArrayList = new ArrayList<>(Arrays.asList(4, 6, 2, 1, 3));

        Assert.assertEquals(outputArrayList, reverse.getReverse(integerArrayList));
    }
}
