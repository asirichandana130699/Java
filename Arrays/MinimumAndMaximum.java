public class MinimumAndMaximum {

    static int getMaximum(int[] arr) {
        int maximum = arr[0];
        for(int i : arr) {
            if(i > maximum)
                maximum = i;
        }
        return maximum;
    }

    static int getMinimum(int[] arr) {
        int minimum  = arr[0];
        for(int i : arr) {
            if(i < minimum)
                minimum = i;
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 20, 18, 75};
        System.out.println(getMaximum(arr));
        System.out.println(getMinimum(arr));
    }
}
