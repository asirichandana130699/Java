public class FibonacciSeriesProgram {
    public static void main(String[] args) {
        int number = 10;
        int firstNumber = 0, secondNumber = 1;
        System.out.print(firstNumber + ", " + secondNumber + ", ");
        for(int i = 2; i < number; i++) {
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            System.out.print(sum + ", ");
        }
    }
}
