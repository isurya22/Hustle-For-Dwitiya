package org.java.Interview.Interface.QN2Default;

public interface Manager {

    default void generateReport(){
        System.out.println("Manager's report generated");
    }
}
