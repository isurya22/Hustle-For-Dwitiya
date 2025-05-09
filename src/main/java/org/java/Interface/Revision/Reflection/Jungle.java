package org.java.Interface.Revision.Reflection;

import java.util.Arrays;

public class Jungle {
    public static void main(String[] args) {
        Class<Tiger> tigerClass = Tiger.class;
        System.out.println(tigerClass);

        System.out.println(tigerClass.getName());

        System.out.println(Arrays.toString(tigerClass.getFields()));

    }
}
