package org.java.PushForCode.Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    //Find duplicate elements from a List using Streams.

    public static void main(String[] args) {
        List<Integer> elementList = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 7, 1);

        Set<Integer> uniqueElements = new HashSet<>();

        elementList.stream().filter(m-> !uniqueElements.add(m)).forEach(System.out::println);

        //System.out.println(duplicates);
    }
}
