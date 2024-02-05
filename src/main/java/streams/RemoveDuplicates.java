package streams;

import collections.set.StringOperations;

import java.util.List;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public List<Integer> removeAllDuplicates(List<Integer> inputList) {
        return inputList.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}


