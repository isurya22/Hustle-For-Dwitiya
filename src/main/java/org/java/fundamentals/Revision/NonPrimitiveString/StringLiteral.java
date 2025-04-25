package org.java.fundamentals.Revision.NonPrimitiveString;

public class StringLiteral {
    public static void main(String[] args) {
        String a = "Fox";
        String b = "Fox";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = new String("Fox");
        System.out.println(a==c);
        System.out.println(a.equals(c));
    }
}
