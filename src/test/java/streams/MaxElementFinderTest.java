package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

public class MaxElementFinderTest {
    MaxElementFinder maxElementFinder = new MaxElementFinder();
    @Test
    public void testMax() {
        String stringOutput = maxElementFinder.findMaxElement(List.of("i", "am", "siri", "chandana"));
        Assert.assertEquals("siri", stringOutput);
    }
}
