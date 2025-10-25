package org.java.Multithreading.LearningS37;

public class AtomicSharedExample1 {
    int counter;
    public void increment(){
        counter++;
    }
    public int get(){
        return counter;
    }
}
