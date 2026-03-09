package org.java.Transformation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseEachWordInStream {
    //Reverse each word in a sentence
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String result = Arrays.stream(sentence.split(" "))
                .map(e->new StringBuilder(e).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
