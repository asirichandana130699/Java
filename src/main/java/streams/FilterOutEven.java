package streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterOutEven {
    public List<Integer> getFilterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }
}

