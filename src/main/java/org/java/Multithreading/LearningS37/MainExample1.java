package org.java.Multithreading.LearningS37;

public class MainExample1 {
    public static void main(String[] args) {

        AtomicSharedExample1 sharedExample1 = new AtomicSharedExample1();
        for (int i = 0; i <300; i++){
            sharedExample1.increment();
        }
        System.out.println(sharedExample1.get());
    }
}
