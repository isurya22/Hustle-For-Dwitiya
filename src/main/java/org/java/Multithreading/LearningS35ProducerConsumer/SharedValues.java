package org.java.Multithreading.LearningS35ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedValues {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedValues(int bufferSize){
        this.bufferSize = bufferSize;
        sharedBuffer = new LinkedList<>(); //Good for general-purpose queue operations.
    }

    public synchronized void produceItem(int item) throws InterruptedException {
        //If Buffer is full, wait for the consumer to consume items
        while(sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full, Producer is waiting for Consumer.");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+ item);
        // Notify the consumer that there are items to consume now
        notify();
    }

    public synchronized void consumeItem() throws InterruptedException {
        //Buffer is empty, wait for the producer to produce items
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, consumer is waiting for producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed: " + item);
        //Notify the producer that there is space in the buffer now
        notify();
    }

}
