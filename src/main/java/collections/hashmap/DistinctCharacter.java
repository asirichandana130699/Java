package collections.hashmap;

import java.util.HashMap;

public class DistinctCharacter {
    public HashMap<Character, Integer> getCountOfCharacters(String inputString) {
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        char[] c = inputString.toCharArray();
        for(int i = 0; i < c.length; i++) {
            characterIntegerHashMap
                    .put(c[i], characterIntegerHashMap
                            .getOrDefault(c[i], 0) + 1);

        }
        return characterIntegerHashMap;
    }

}
