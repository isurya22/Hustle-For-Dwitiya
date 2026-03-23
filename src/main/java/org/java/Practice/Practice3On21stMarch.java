package org.java.Practice;

import java.util.Map;
import java.util.stream.Collectors;

public class Practice3On21stMarch {
    //#Count the frequency of character in a string
    public static void main(String[] args) {
        String word = "Choklingam";

        Map<Character, Long> result = word.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result);
    }
}
