package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {
    public List<String> sortBasedOnLength(String[] strings) {
        return Arrays.stream(strings)
                .sorted((stringOne, stringTwo) -> {
                    if(stringOne.length() == stringTwo.length())
                        return stringOne.charAt(stringOne.length() - 1) - stringTwo.charAt(stringTwo.length() - 1);
                    else
                        return stringOne.length() - stringTwo.length();
                }).collect(Collectors.toList());
    }
}

