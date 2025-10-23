package org.java.Multithreading.LearningS36;

import java.util.concurrent.locks.StampedLock;

public class StampedLockOptimisticScenario {
    //StampedLock support Optimistic Lock functionality too.

    int a = 10;
    StampedLock stampedLock = new StampedLock();

    public void producer(){
        long stamp = stampedLock.tryOptimisticRead();
        try{
            System.out.println("Taken Optimistic Lock");
            a = 11;
            Thread.sleep(6000);
            if (stampedLock.validate(stamp)){
                System.out.println("updated a value successfully");
            } else {
                System.out.println("Rollback of work");
                a = 10; //rollback
            }
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public void consumer(){
        long stamp = stampedLock.writeLock();
        System.out.println("Write lock acquired by : " + Thread.currentThread().getName());

        try {
            System.out.println("Performing work");
            a = 9;
            }
        finally {
            stampedLock.unlockWrite(stamp);
            System.out.println("Write lock released by : " + Thread.currentThread().getName());
        }
    }
}
