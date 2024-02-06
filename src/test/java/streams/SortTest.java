package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SortTest {
    Sort sort = new Sort();
    @Test
    public void testStringSort() {
        Assert.assertEquals(List.of("i", "am", "alla","siri", "chandana"),
                sort.sortBasedOnLength(new String[]{"siri", "alla", "chandana", "i", "am"}));
    }
}
