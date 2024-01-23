package arrays;

public class SortingAlgorithm {

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int tempValue = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempValue;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 20, 18, 75};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
