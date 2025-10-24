package org.java.Multithreading.LearningS36;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class SemaphoreSharedLock {

    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception ex){
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        finally {
            System.out.println("Lock released by : " + Thread.currentThread().getName());
        }
    }
}
