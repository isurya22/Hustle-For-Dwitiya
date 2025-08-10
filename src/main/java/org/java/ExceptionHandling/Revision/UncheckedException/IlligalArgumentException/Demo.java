package org.java.ExceptionHandling.Revision.UncheckedException.IlligalArgumentException;

public class Demo {
    public static void main(String[] args) {
        int val = Integer.parseInt("56");
        System.out.println(val);
        int val2 = Integer.parseInt("abc");  //NumberFormatException
        System.out.println(val2);
    }
}
