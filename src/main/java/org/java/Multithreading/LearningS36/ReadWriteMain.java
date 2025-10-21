package org.java.Multithreading.LearningS36;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteMain {
    public static void main(String[] args) {

        ReadWriteLockSharedLock sharedLock = new ReadWriteLockSharedLock();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread th1 = new Thread(()-> sharedLock.producer(lock));
        Thread th2 = new Thread(()->sharedLock.producer(lock));

        ReadWriteLockSharedLock sharedLock1 = new ReadWriteLockSharedLock();
        Thread th3 = new Thread(()->sharedLock1.consumer(lock));

        th1.start();
        th2.start();
        th3.start();
    }
}
