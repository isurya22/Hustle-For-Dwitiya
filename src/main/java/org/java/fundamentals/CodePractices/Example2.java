package org.java.fundamentals.CodePractices;

public class Example2 {
    public static void main(String[] args) {
        String a = "Sanjana";
        String b = "Radhika";
        String c = "Sanjana";
        String d = new String("Honey");

        System.out.println(a.equals(b));
        System.out.println(c==d);
    }

}
