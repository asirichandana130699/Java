package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FilterOutEvenTest {
    FilterOutEven filterOutEven = new FilterOutEven();
    @Test
    public void testFilter(){
        Assert.assertEquals(List.of(4, 16), filterOutEven.getFilterEvenNumbers(List.of(1, 2, 3, 4)));
    }
}
