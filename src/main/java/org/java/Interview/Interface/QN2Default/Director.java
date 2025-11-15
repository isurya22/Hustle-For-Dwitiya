package org.java.Interview.Interface.QN2Default;

public interface Director {
    default void generateReports(){
        System.out.println("Director's reports generated.");
    }
}
