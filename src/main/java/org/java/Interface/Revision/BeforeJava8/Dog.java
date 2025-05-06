package org.java.Interface.Revision.BeforeJava8;

public class Dog implements PetAnimal{

    @Override
    public void obeyOrders() {
        System.out.println("Dog are smart so they will listen.");
    }

    @Override
    public void giveSecurity() {
        System.out.println("Protecting skill are very High.");
    }
}
