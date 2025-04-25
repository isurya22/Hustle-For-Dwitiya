package org.java.fundamentals.Revision;

public class DowncastingExample2 {
    public static void main(String[] args) {
        int a = 54;
        double b = 6.7;
        //If you to show the sum in Int then go for below step.
        //int sum = (int) (a+b);
        /*
          Otherwise if you want to print sum in double value then no need to downcast the variable.
         */

        double sum = a+b;
        System.out.println(sum);
    }
}
