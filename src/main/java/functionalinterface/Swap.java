package functionalinterface;

public class Swap {
    public int[] swappingWithOutThird(int numberOne, int numberTwo) {
        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;
        return new int[]{numberOne, numberTwo};
    }
}
