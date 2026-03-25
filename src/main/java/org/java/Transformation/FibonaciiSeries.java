package org.java.Transformation;

public class FibonaciiSeries {
    //#Print Fibonacci series up to 20 terms
    public static void main(String[] args) {
        int term = 20;
        int a = 0, b = 1;

        for (int i = 1; i <= term; i++){
            System.out.println( a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

}
