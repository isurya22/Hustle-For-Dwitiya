package org.java.Multithreading.LearingS34.ProducerConsumerExample;

public class SharedResource {

    boolean isItemAvailable = false;

    //Synchronized put the Monitor Lock in this Thread
    public synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Producer Thread is calling notifyAll method....");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Item consumed by :"+ Thread.currentThread().getName());

        //using while loop to avoid "spurious wake-up", sometime because of system noise
        while(!isItemAvailable){
            try{
                System.out.println("Consumer Thread " +Thread.currentThread().getName()+" is waiting now.");
                wait();  //it releases the monitor lock
            } catch (Exception ex){
                System.out.println(ex.getStackTrace());
            }
        }

        System.out.println("Consumed thread: "+Thread.currentThread().getName());
        isItemAvailable = false;
    }
}
