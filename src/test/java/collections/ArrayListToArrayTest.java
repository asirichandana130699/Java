package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArrayTest {
    ArrayListToArray arrayListToArray = new ArrayListToArray();
    @Test
    public void testConversion() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Siri");
        list.add("Chandana");
        list.add("A");
        String[] listNames = arrayListToArray.convertListToArray(list);
        Assert.assertArrayEquals(new String[]{"Siri", "Chandana", "A"}, listNames);
        list.remove(list.get(list.size() - 1));
        listNames = arrayListToArray.convertListToArray(list);
        Assert.assertEquals(2, listNames.length);
    }
}
