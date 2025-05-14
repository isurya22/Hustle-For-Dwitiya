package org.java.ExceptionHandling.Revision.NullPointerException;

public class NullPointerExample {
    public static void main(String[] args) {
        Person person = null;
        try{
            String name = person.personName;
            person.personName = "Pintu";
        } catch (NullPointerException e) {
            System.err.println("NullPointer Exception caught !");
            e.printStackTrace();
        }
    }
}
