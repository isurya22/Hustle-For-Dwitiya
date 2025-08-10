package org.java.ExceptionHandling.Revision.CheckedException.ClassNotFoundException;

public class GeneralException {
    public static void main(String[] args) throws ClassNotFoundException {
        method1();
    }
    //If you will write the line from 8 to 10. Compiler will tell this "must be caught or declared to be thrown"
    /*public static void method1(){
        throw new ClassNotFoundException();
    }*/
    //So we have to handle using throws keyword.
    public static void method1() throws ClassNotFoundException{  //throws tells that this method1 might throw this exception. So Caller handle with appropriately.
        throw new ClassNotFoundException();
    }

    //You can check the Example of
}
