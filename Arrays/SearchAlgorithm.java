public class SearchAlgorithm {

    static int linearSearch(int[] arr, int searchElement) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 20, 18, 75};
        int element = 20;
        if(linearSearch(arr, element) == -1)
            System.out.println("Not Found");
        else
            System.out.println("Found");
    }
}
