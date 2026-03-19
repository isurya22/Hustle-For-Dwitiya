package org.java.Practice;

public class Practice1On19thMarch {
    //Print 1 to 10 using 2 thread
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {

        Thread t1 = new Thread(()-> {
            while(number <= 10) {
                synchronized (lock) {
                    while (number % 2 == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (number <= 10){
                        System.out.println("Thread-1: "+ number);
                        number++;
                        lock.notifyAll();
                    }
                }
            }
        });
        Thread t2 = new Thread(()-> {
             while(number <= 10){
                 synchronized (lock){
                     while (number % 2 == 1) {
                         try {
                             lock.wait();
                         } catch (InterruptedException e) {
                             e.printStackTrace();}
                     }
                     if (number <= 10){
                         System.out.println("Thread-2: "+ number);
                         number++;
                         lock.notifyAll();
                     }
                 }
             }
        });

        t1.start();
        t2.start();
    }
}
