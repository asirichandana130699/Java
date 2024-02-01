package functionalinterface;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SortTest {
    Sort sort = new Sort();
    @Test
    public void testSortHashMap() {
        Map<Integer, String> hashMap = createHashMap();
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Chandana");
        map.put(2, "Siri");
        map.put(3, "A");
        Assert.assertEquals(map, sort.sortHashMap(hashMap));
    }
    public Map<Integer, String> createHashMap() {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2, "Siri");
        hashMap.put(1, "Chandana");
        hashMap.put(3, "A");
        return hashMap;
    }
}
