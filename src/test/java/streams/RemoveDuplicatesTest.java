package streams;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RemoveDuplicatesTest {
    RemoveDuplicates removeDuplicates = new RemoveDuplicates();
    @Test
    public void testRemove() {
        Assert.assertEquals(List.of(1, 2, 3, 4, 5, 7), removeDuplicates
                .removeAllDuplicates(List.of(1, 1, 3, 3, 2, 4, 5, 7, 7)));
    }
}
