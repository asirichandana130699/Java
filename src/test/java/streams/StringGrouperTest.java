package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class StringGrouperTest {
    StringGrouper stringGrouper = new StringGrouper();
    @Test
    public void testGrouping() {
        Map<Integer, List<String>> integerListMap = stringGrouper
                .getListGroupByLength(List.of("hello", "i", "am", "siri", "chandana"));
        Assert.assertEquals(List.of("hello"), integerListMap.get(5));
        Assert.assertNull(integerListMap.get(6));
    }
}
