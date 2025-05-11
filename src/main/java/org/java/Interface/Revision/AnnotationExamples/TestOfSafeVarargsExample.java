package org.java.Interface.Revision.AnnotationExamples;

import java.util.Arrays;
import java.util.List;

import static org.java.Interface.Revision.AnnotationExamples.SafeVarargsExample.printLogValues;

public class TestOfSafeVarargsExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50);

        // Call the varargs method with two lists
        printLogValues(list1, list2);
    }
}
