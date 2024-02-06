package streams;
import java.util.*;

public class StringGrouper {

    public Map<Integer, List<String>> getListGroupByLength(List<String> stringList) {
        Map<Integer, List<String>> integerListMap = new HashMap<>();
        stringList.forEach(string -> {
            List<String> list = integerListMap.getOrDefault(string.length(), new ArrayList<>());
            list.add(string);
            integerListMap.put(string.length(), list);
        });
        return integerListMap;
    }
}
//It initializes an empty HashMap<Integer, List<String>>.
//It iterates over each string in the input list.
//For each string, it checks if there's already a list for strings of its length in the map:
//If there is, it retrieves this list.
//If not, it creates a new ArrayList<String> and uses it.
//It adds the current string to the list associated with its length.
//It puts (or updates) the list back into the map with the string length as the key.
//Finally, it returns the map.


