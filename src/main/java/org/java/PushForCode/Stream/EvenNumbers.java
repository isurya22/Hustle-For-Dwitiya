package org.java.PushForCode.Stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    //Find all even numbers from a List using Streams.

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(22,13,6,23,49,10,67);
        numberList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
