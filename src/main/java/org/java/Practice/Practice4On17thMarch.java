package org.java.Practice;

import java.util.Map;
import java.util.stream.Collectors;

public class Practice4On17thMarch {
    //#Count the frequency of character in a string

    public static void main(String[] args) {
        String firstName = "Satyanarayan";

        Map<Character,Long> result = firstName.toLowerCase().chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(result);
    }
}
