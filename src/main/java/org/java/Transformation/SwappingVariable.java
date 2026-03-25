package org.java.Transformation;

public class SwappingVariable {
    //Write a program swapping variable a = 30, b = 80

    public static void main(String[] args) {
        int a = 30, b = 80;

        int c;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }
}
