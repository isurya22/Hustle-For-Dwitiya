package org.java.Interface.Revision.ConsumerInteface;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> loggingObject = (Integer val) -> {
            if(val>10){
                System.out.println("logging");
            }
        };
        loggingObject.accept(11);
    }
}
