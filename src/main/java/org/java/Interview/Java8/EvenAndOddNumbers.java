package org.java.Interview.Java8;

import java.util.Arrays;
import java.util.List;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,12,22,5,63,7);

        System.out.println("3) Find out all the evan and odd numbers that exist in the list using Stream functions. ");

        System.out.println("Even numbers are below: ");
        numbers.stream().filter(s->s%2==0).forEach(System.out::println);
        System.out.println("Odd numbers are below: ");
        numbers.stream().filter(s->s%2 != 0).forEach(System.out::println);
    }
}
