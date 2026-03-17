package org.java.Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice3On17thMarch {
    //#Reverse each word in a sentence
    public static void main(String[] args) {
        String sentence = "God is Good";
        String result = Arrays.stream(sentence.split(" ")).map(e->new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("Reverse sentence is : "+result);
    }
}
