package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraverseArrayListTest {
    TraverseArrayList traverseArrayList = new TraverseArrayList();
    @Test
    public void testListSuccess() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Siri", "Chandana", "A"));
        List<String> expectedListOutput = Arrays.asList("Siri", "Chandana", "A");
        Assert.assertEquals(expectedListOutput, traverseArrayList.getListWithForLoop(employeeList));
    }

    @Test
    public void testListSuccessEnhanced() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Siri", "Chandana", "A"));
        List<String> expectedListOutput = Arrays.asList("Siri", "Chandana", "A");
        Assert.assertEquals(expectedListOutput, traverseArrayList.getListWithEnhancedForLoop(employeeList));
    }
}
