package org.java.ExceptionHandling.CodePractices.ExceptionFlow;

public class MathExam {
    public static void main(String[] args) {
        MathematicClass mathematicClass = new MathematicClass();
        mathematicClass.add(5,7);
        mathematicClass.multiply(6,5);
        mathematicClass.substract(7,5);
        mathematicClass.divide(4,0);
    }
}
