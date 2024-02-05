package streams;

import java.util.List;

public class SumOfSquares {
    public int getSumOfSquares(List<Integer> list) {
        return list.stream()
                .filter(value -> value > 0)
                .mapToInt(value -> value * value)
                .sum();
    }
}
