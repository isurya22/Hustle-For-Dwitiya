package org.java.Multithreading.LearingS34.ProducerConsumerExample;

public class MyMain {
    public static void main(String[] args) {

        System.out.println("Main Method starts");

        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(()->sharedResource.addItem());
        Thread consumerThread = new Thread(()->sharedResource.consumeItem());

        producerThread.start();
        consumerThread.start();

        System.out.println("Main Method ends........");

    }
}
