package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CapitalizeAndSortTest {
    CapitalizeAndSort capitalizeAndSort = new CapitalizeAndSort();
    @Test
    public void testCapitalize() {
        Assert.assertEquals(List.of("Alla", "Chandana", "Siri"),
                capitalizeAndSort.capitalizeFirstLetterAndSort(new String[]{"siri", "chandana", "alla"}));
    }
}
