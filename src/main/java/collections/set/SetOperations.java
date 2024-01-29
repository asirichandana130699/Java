package collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetOperations {
    public HashSet<String> getInformationUsingForLoop(HashSet<String> input) {
        HashSet<String> stringHashSet = new HashSet<>();
        String[] array = input.toArray(new String[0]);
        for(int i = 0; i < array.length; i++)
            stringHashSet.add(array[i]);
        return stringHashSet;
    }

    public HashSet<String> getInformationUsingEnhancedFor(HashSet<String> input) {
        HashSet<String> stringHashSet = new HashSet<>();
        for(String s : input)
            stringHashSet.add(s);
        return stringHashSet;
    }

    public HashSet<String> getInformationUsingIterator(HashSet<String> input) {
        HashSet<String> stringHashSet = new HashSet<>();
        Iterator<String> stringIterator = input.iterator();
        while(stringIterator.hasNext())
            stringHashSet.add(stringIterator.next());
        return stringHashSet;
    }
}
