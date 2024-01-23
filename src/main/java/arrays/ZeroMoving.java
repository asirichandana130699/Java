package arrays;

public class ZeroMoving {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 0, 5, 0};
        int[] newArray = new int[arr.length];
        int countZeros = 0, index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                newArray[index] = arr[i];
                index++;
            }
            else {
                countZeros++;
            }
        }
        while(countZeros != 0) {
            newArray[index] = 0;
            index++;
            countZeros--;
        }

        for(int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
