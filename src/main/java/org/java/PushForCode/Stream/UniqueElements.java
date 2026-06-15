package org.java.PushForCode.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueElements {
    //Find unique elements from a List using Streams.

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);

        List<Integer> uniqueList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);
    }
}
