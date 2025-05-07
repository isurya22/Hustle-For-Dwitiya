package org.java.Interface.Revision.LamdaExpression;

public class Tiger {
    public static void main(String[] args) {
        Animal animal = () -> System.out.println("Kill anybody");
        animal.canKill();
    }
}
