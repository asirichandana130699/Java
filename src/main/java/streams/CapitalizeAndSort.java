package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeAndSort {
    public List<String> capitalizeFirstLetterAndSort(String[] strings) {
        return Arrays.stream(strings)
                .map(string -> string.substring(0, 1).toUpperCase() +
                        string.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }
}


