package org.java.Interface.Revision.BeforeJava8;

public class Cat implements PetAnimal{

    @Override
    public void obeyOrders() {
        System.out.println("Cat are cool in their smartness.");
    }

    @Override
    public void giveSecurity() {
        System.out.println("you will not find this skill");
    }
}
