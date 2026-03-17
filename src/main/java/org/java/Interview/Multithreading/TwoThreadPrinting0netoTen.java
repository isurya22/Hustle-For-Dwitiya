package org.java.Interview.Multithreading;

public class TwoThreadPrinting0netoTen {
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            while(number <= 10) {
                synchronized (lock) {
                    while (number % 2 == 0) {  // wait for odd numbers
                        try { lock.wait(); }
                        catch (InterruptedException e) { }
                    }
                    if (number <= 10) {
                        System.out.println("Thread-1: " + number);
                        number++;
                        lock.notifyAll();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (number <= 10) {
                synchronized (lock) {
                    while (number % 2 == 1) {  // wait for even numbers
                        try { lock.wait(); } catch (InterruptedException e) { }
                    }
                    if (number <= 10) {
                        System.out.println("Thread-2: " + number);
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
