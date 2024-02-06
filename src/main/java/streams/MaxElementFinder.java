package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxElementFinder {
    public String findMaxElement(List<String> strings) {
        return strings.stream()
                .max(Comparator.naturalOrder())
                .get()
                .toString();
    }
}

