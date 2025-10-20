package org.java.Multithreading.LearningS36;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSharedResource {
    boolean isAvailable = false;

    ReentrantLock lock = new ReentrantLock();

    public void producer(){
        try{
            lock.lock();
            System.out.println("Thread acquired by producer: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

        finally {
            lock.unlock();
            System.out.println("Thread acquired by finally block: "+ Thread.currentThread().getName());
        }
    }
}
