package org.java.PushForCode.Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingElement {
    //Find the first non-repeating element in a List using Streams.
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 20, 30, 20, 40, 10, 50);

        Integer nonRepeatingElement = numberList.stream().collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
        ))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(nonRepeatingElement);
    }
}
