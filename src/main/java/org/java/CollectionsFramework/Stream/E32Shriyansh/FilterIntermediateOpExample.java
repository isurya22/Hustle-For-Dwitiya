package org.java.CollectionsFramework.Stream.E32Shriyansh;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterIntermediateOpExample {
    public static void main(String[] args) {
        //Learning how many ways Intermediate operations are available

        List<Integer> salaryList = Arrays.asList(72000,90000,120000,150000);
        List<Integer> filterStream = salaryList.stream().filter((Integer i)-> i>=100000).collect(Collectors.toList());

        System.out.println(filterStream);
    }
}
