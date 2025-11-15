package org.java.Interview.Interface.QN2Default;

public class Employee implements Manager,Director {


    public static void main(String[] args) {
        Manager manager = new Employee();
        manager.generateReport();

        Director director = new Employee();
        director.generateReports();
    }
}
