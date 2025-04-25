package org.java.fundamentals.Revision;

public class UnderstandingByte {
    byte var;
    void dummyMethod(){
        /*
           If you want to define default byte variable then you should define it in Class member variable.
           If you want to define In Method member variable then you must initialize the variable or else through an error.
         */
        //byte var2;
        System.out.println(var);
        //System.out.println(var2);
    }

    public static void main(String[] args) {
        UnderstandingByte ub = new UnderstandingByte();
        ub.dummyMethod();
    }
}
