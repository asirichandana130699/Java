package collections;

import java.util.HashMap;

public class ArraysSum {
    public int[] getSum(int[] arr, int target) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(integerIntegerHashMap.containsKey(target - arr[i]))
                return new int[]{integerIntegerHashMap.get(target - arr[i]), i};
            integerIntegerHashMap.put(arr[i], i);
        }
        return null;
    }
}
