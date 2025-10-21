package org.java.Multithreading.LearningS36;

import java.util.concurrent.locks.ReadWriteLock;

public class ReadWriteLockSharedLock {
    boolean isAvailable = false;
    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("Read Lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock Released By : "+ Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock){
        try {
            lock.readLock().lock();
            System.out.println("Write Lock acquired by : "+ Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.readLock().unlock();
            System.out.println("Write lock released by: "+ Thread.currentThread().getName());
        }
    }
}
