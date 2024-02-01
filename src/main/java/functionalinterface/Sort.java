package functionalinterface;

import java.util.Map;
import java.util.TreeMap;

public class Sort {
    public Map<Integer, String> sortHashMap(Map<Integer, String> hashMap) {
        return new TreeMap<>(hashMap);
    }

}
