package org.java.Multithreading.LearingS34.ProducerConsumerExample;

public class SharedResource {

    boolean isItemAvailable = false;

    public synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Item added by : "+ Thread.currentThread().getName());

    }

    public synchronized void consumeItem(){
        System.out.println("Item consumed by :"+ Thread.currentThread().getName());

        //using while loop to avoid "spurious wake-up", sometime because of system noise
        while(!isItemAvailable){
            try{
                System.out.println("Thread " +Thread.currentThread().getName()+"is waiting now.");
            } catch (Exception ex){
                System.out.println(ex.getStackTrace());
            }
        }

        System.out.println("Consumed thread: "+Thread.currentThread().getName());
        isItemAvailable = false;
    }
}
