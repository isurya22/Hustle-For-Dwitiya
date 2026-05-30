package org.java.PracticeOnFunctionalInterface;

import java.util.Map;
import java.util.stream.Collectors;

public class PracticeFunctional {
    public static void main(String[] args) {
        String str = "Suryanarayan Behera";
        Map<Character, Long> count = str.toLowerCase().chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(count);
    }
}
