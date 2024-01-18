public class ArrayReverse {

    static void reverseOfArray(int[] arr) {
        for(int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);

        }
    }
    public static void main(String[] args) {
        int[] arr = {25, 15, 1, 2, 76};
        reverseOfArray(arr);
    }
}
