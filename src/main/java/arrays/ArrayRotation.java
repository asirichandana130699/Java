package arrays;

public class ArrayRotation {

    static int[] rotateArray(int[] arr, int position) {
        int[] newArray = new int[arr.length];
        int flag = position;
        for(int i = 0; i < arr.length; i++) {
            if(position > 0) {
                newArray[arr.length - position] = arr[i];
                position--;
            }
            else {
                newArray[i - flag] = arr[i];
            }

        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int position = 2;
        arr = rotateArray(arr, position);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
