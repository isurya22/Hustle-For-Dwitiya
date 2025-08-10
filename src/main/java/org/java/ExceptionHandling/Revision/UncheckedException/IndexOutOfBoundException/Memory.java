package org.java.ExceptionHandling.Revision.UncheckedException.IndexOutOfBoundException;

public class Memory {
    //ArrayIndexOutOfBoundException
    public static void main(String[] args) {
        int[] capsule = new int[]{23,21};
        System.out.println(capsule[3]); //here we are trying to call index 3.
    }
}
