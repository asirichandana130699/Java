package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

public class UniqueCountTest {
    UniqueCount uniqueCount = new UniqueCount();
    @Test
    public void testGetUniqueWords() {
        Assert.assertEquals(6, uniqueCount.getCountUniqueWords("Here is the input string .where string contains characters"));
        //Failure
        Assert.assertNotEquals(3, uniqueCount.getCountUniqueWords("siri"));
        //Edge case
        Assert.assertEquals(0, uniqueCount.getCountUniqueWords(""));
    }
}
