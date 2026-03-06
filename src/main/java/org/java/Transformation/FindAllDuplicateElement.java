package org.java.Transformation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicateElement {
    public static void main(String[] args) {
        //Find all duplicate element in a List

        List<Integer> num = Arrays.asList(1,7,5,3,4,8,1,7,5);

        Set<Integer> dup =  new HashSet<>();

        num.stream()
                .filter(e->!dup.add(e))
                .forEach(e-> System.out.println("Duplicate element: "+e));

    }
}
