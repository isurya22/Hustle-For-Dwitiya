package org.java.Multithreading.LearningS36;

public class StampedLockOptimisticMain {
    public static void main(String[] args) {

        StampedLockOptimisticScenario resource = new StampedLockOptimisticScenario();

        Thread th1 = new Thread(()-> resource.producer());
        Thread th2 = new Thread(()-> resource.producer());

        th1.start();
        th2.start();
    }
}
