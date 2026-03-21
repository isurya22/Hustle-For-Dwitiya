package org.java.Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice2On21stMarch {
    //#Reverse each word in a sentence
    public static void main(String[] args) {
        String sentence = "Dhurandhar 2 movie was exceptional";
        String result = Arrays.stream(sentence.split(" "))
                .map(e->new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
