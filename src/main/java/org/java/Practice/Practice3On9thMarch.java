package org.java.Practice;

import java.util.Map;
import java.util.stream.Collectors;

public class Practice3On9thMarch {
    //Count the frequency of character in a string
    public static void main(String[] args) {
        String word = "Talatam Venkata Sai Vivek";

        Map<Character, Long> result = word.toLowerCase().chars()
                .mapToObj(e->(char)e)
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));
        System.out.println(result);
    }
}
