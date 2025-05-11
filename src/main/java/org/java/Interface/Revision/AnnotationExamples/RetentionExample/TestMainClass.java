package org.java.Interface.Revision.AnnotationExamples.RetentionExample;

import java.util.Arrays;

public class TestMainClass {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(TestClass.class.getAnnotations()));
    }
}
