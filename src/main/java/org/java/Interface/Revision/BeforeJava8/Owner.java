package org.java.Interface.Revision.BeforeJava8;

public class Owner {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.obeyOrders();
        dog.giveSecurity();

        Cat cat = new Cat();
        cat.obeyOrders();
        cat.giveSecurity();
    }
}
