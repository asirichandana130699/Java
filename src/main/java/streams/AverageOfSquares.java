package streams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageOfSquares {
    public double findAverageOfSquaresOfOdds(int[] numbers) {
        OptionalDouble average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }
}

