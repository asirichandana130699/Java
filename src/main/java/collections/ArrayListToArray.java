package collections;

import java.util.ArrayList;

public class ArrayListToArray {

    public String[] convertListToArray(ArrayList<String> stringArrayList) {
        // Converting ArrayList to an Array
        return stringArrayList.toArray(new String[0]);
    }

}
