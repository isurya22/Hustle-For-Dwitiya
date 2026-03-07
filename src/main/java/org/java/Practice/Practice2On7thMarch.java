package org.java.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice2On7thMarch {
    public static void main(String[] args) {
        //Find all duplicate Element

        List<Integer> num = Arrays.asList(1,7,5,3,4,8,1,7,5);

        Set<Integer> duplicateNumber = new HashSet<>();

        num.stream().filter(e->!duplicateNumber.add(e))
                .forEach(System.out::println);
    }
}
