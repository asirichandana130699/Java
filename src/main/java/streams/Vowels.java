package streams;


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Vowels {

    // Method to print strings containing vowels and their vowel count
    public Map<String, Integer> getStringsWithVowels(String[] strings) {
        return Arrays.stream(strings)
                .collect(Collectors.toMap(key -> key,
                        value -> Math.toIntExact(value.chars()
                                .mapToObj(c -> (char) c)
                                .filter(this::isVowels)
                                .count())));
    }

    private boolean isVowels(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
