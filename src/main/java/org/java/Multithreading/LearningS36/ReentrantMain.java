package org.java.Multithreading.LearningS36;

public class ReentrantMain {
    public static void main(String[] args) {

        ReentrantLockSharedResource resource = new ReentrantLockSharedResource();

        Thread t1 = new Thread(()-> {
            resource.producer();
        });

        Thread t2 = new Thread(()->{
            resource.producer();
        });

        t1.start();
        t2.start();
    }
}
