package org.java.Interface.Revision.AnonymousFunctionalInterface;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void canFly() {
                System.out.println("Peacock can fly !!!!");
            }
        };
        bird.canFly();
    }
}
