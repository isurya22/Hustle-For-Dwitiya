package org.java.Interface.Revision;

public class BirdKeeper
{
    public static void main(String[] args) {
        Bird bird1 = new Eagle();
        Bird bird2 = new Hen();

        bird1.fly();
        bird2.fly();
    }
}
