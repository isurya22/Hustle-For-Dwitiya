package org.java.fundamentals.Revision.VariableArgument;

public class MathBook {

    public void addNumbers(int ...numbers){
        int sum = 0;
        for(int no : numbers) {
            sum = sum + no;
            System.out.println(sum);
        }
    }
}
