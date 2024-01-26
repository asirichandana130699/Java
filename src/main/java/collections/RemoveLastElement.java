package collections;

import java.util.ArrayList;

public class RemoveLastElement {

    public ArrayList<String> removeLastElement(ArrayList<String> list) {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
        return list;
    }
}
