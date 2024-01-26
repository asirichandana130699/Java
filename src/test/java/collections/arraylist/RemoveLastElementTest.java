package collections.arraylist;

import collections.arraylist.RemoveLastElement;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLastElementTest {
    RemoveLastElement removeElement = new RemoveLastElement();
    @Test
    public void testRemoveLast() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Siri", "Chandana"));
        employeeList = removeElement.removeLastElement(employeeList);
        Assert.assertEquals(Arrays.asList("Siri"), employeeList);
        employeeList = removeElement.removeLastElement(employeeList);
        Assert.assertTrue(employeeList.isEmpty());
    }
}
