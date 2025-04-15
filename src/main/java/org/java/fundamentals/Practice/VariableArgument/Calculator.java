package org.java.fundamentals.Practice.VariableArgument;

public class Calculator {
    public static void main(String[] args) {
        MathBook mathBook = new MathBook();
        mathBook.addNumbers(2,3);
        mathBook.addNumbers(3,4,5,1,6,7);
    }
}
