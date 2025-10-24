package org.java.Multithreading.LearningS36;

public class SemaphoreMain {
    public static void main(String[] args) {
        SemaphoreSharedLock sharedLock = new SemaphoreSharedLock();

        Thread th1 = new Thread(sharedLock::producer);

        Thread th2 = new Thread(sharedLock::producer);

        Thread th3 = new Thread(sharedLock::producer);

        Thread th4 = new Thread(sharedLock::producer);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
