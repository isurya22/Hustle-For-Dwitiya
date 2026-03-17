package org.java.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prcatice2On17thMarch {
    //#Find all duplicate element in a List
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,46,3,16,3,2,17,41);
        Set<Integer> uniqueValue = new HashSet<>();

        list.stream().filter(e->!uniqueValue.add(e)).forEach(System.out::println);
    }
}
