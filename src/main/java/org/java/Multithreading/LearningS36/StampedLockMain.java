package org.java.Multithreading.LearningS36;

public class StampedLockMain {
    public static void main(String[] args) {
        StampedLockSharedLock stampedLockSharedLock = new StampedLockSharedLock();

        Thread th1 = new Thread(()->stampedLockSharedLock.producer());
        Thread th2 = new Thread(()->stampedLockSharedLock.producer());
        Thread th3 = new Thread(()->stampedLockSharedLock.consumer());

        th1.start();
        th2.start();
        th3.start();
    }
}
