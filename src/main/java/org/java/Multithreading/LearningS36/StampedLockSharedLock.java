package org.java.Multithreading.LearningS36;

import java.util.concurrent.locks.StampedLock;

public class StampedLockSharedLock {
    boolean isAvailable = false;
    StampedLock stampedLock = new StampedLock();

    public void producer(){
        long stamp = stampedLock.readLock();
        try{
            System.out.println("Read Lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
        finally {
            stampedLock.unlockRead(stamp);
            System.out.println("Read Lock released By: "+ Thread.currentThread().getName());
        }
    }

    public void consumer(){
        long stamp = stampedLock.writeLock();
        try{
            System.out.println("Write lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            stampedLock.unlockWrite(stamp);
            System.out.println("Write Lock released by : "+ Thread.currentThread().getName());
        }
    }
}
