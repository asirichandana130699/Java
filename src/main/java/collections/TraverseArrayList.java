package collections;

import java.util.ArrayList;
import java.util.List;

public class TraverseArrayList {
    public List<String> getListWithForLoop(ArrayList<String> employeeList) {
        List<String> outputList = new ArrayList<>();
        for(int i = 0; i < employeeList.size(); i++) {
            outputList.add(employeeList.get(i));
        }
        return outputList;
    }

    public List<String> getListWithEnhancedForLoop(ArrayList<String> employeeList) {
        List<String> outputList = new ArrayList<>();
        for(String name : employeeList) {
            outputList.add(name);
        }
        return outputList;
    }
}

