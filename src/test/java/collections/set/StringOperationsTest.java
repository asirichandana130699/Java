package collections.set;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class StringOperationsTest {
    StringOperations stringOperations = new StringOperations();
    @Test
    public void testRemoveDuplicates() {
        String outputString = stringOperations.removeDuplicates("Hello");
        Assert.assertEquals("Helo", outputString);
    }

    @Test
    public void testRemoveDuplicatesFailure() {
        String outputString = stringOperations.removeDuplicates("");
        Assert.assertTrue(outputString.isEmpty());
        outputString = stringOperations.removeDuplicates("avis");
        Assert.assertEquals("avis", outputString);
    }

}
