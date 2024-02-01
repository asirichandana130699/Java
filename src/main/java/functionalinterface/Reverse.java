package functionalinterface;

import java.util.ArrayList;

public class Reverse {
    public ArrayList<Integer> getReverse(ArrayList<Integer> integerArrayList) {
        ArrayList<Integer> outputArrayList = new ArrayList<>();
        for(int i = integerArrayList.size() - 1; i >= 0; i--)
            outputArrayList.add(integerArrayList.get(i));

        return outputArrayList;
    }
}
