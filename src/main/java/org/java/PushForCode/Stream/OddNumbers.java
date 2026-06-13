package org.java.PushForCode.Stream;
import java.util.Arrays;
import java.util.List;

public class OddNumbers {
    //Find all odd numbers from a List using Streams.

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(23,55,13,6,9,62);

        numberList.stream().filter(x-> x % 2 != 0).forEach(System.out::println);
    }
}
