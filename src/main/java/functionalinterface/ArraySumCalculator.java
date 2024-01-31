package functionalinterface;

public class ArraySumCalculator {


    public static int sumArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
