package org.java.Practice;

public class PracticeOn21stMarch {
    //
    // #Print 1 to 10 numbers using 2 thread
    private final static Object lock = new Object();
    private static int number = 1;
    public static void main(String[] args) {

        Thread m1 = new Thread(()->{
            while( number <= 10){
               synchronized (lock) {
                   while (number % 2 == 0) {
                       try {
                           lock.wait();
                       } catch (InterruptedException ignored){}
                   }
                   if (number <= 10) {
                       System.out.println("Thread-1 : " + number);
                       number++;
                       lock.notifyAll();
                   }
               }
            }
        });
        Thread m2 = new Thread(()->{
            while(number <= 10){
                synchronized (lock){
                    while (number % 2 == 1){
                        try{
                            lock.wait();
                        } catch (InterruptedException ignored){}
                    }
                    if(number <= 10) {
                        System.out.println("Thread-2 : " + number);
                        number++;
                        lock.notifyAll();
                    }
                }
            }
        });

        m1.start();
        m2.start();
    }
}
