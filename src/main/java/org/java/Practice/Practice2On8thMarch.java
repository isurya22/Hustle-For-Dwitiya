package org.java.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice2On8thMarch {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,7,5,3,4,8,1,7,5);

        Set<Integer> duplicate = new HashSet<>();

        integerList.stream().filter(e->!duplicate.add(e)).forEach(System.out::println);
    }
}
