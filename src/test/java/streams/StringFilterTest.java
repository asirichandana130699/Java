package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

public class StringFilterTest {
    StringFilter stringFilter = new StringFilter();
    @Test
    public void testStringFilter() {
        List<String> stringList = List.of("siri", "chandana", "Alla");
        Predicate<String> isStartsWithA = string -> string.startsWith("A");
        Assert.assertEquals(List.of("Alla"), stringFilter.getListWithA(stringList, isStartsWithA));
    }
}
