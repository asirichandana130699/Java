package collections.set;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class SetOperationsTest {
    SetOperations setOperations = new SetOperations();
    @Test
    public void testGetInfo() {
        HashSet<String> hashSet = createHashSet();
        HashSet<String> outputSet = setOperations.getInformationUsingForLoop(hashSet);
        int length = outputSet.size();
        Assert.assertEquals(length, 10);
        outputSet = setOperations.getInformationUsingIterator(hashSet);
        Assert.assertNotNull(outputSet);
        outputSet = setOperations.getInformationUsingEnhancedFor(hashSet);
        Assert.assertFalse(outputSet.isEmpty());
    }


    public HashSet<String> createHashSet() {
        HashSet<String> inputSet = new HashSet<>();
        for(int i = 1; i <= 10; i++)
            inputSet.add("String input" + i);
        return inputSet;
    }
}
