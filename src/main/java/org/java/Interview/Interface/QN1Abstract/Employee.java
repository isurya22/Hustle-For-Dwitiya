package org.java.Interview.Interface.QN1Abstract;

public class Employee implements Manager,Director{

    public static void main(String[] args) {

        Manager manager = new Employee();
        manager.generateReports();

        Director director = new Employee();
        director.generateReports();
    }

    @Override
    public void generateReports() {
        System.out.println("Reports generate successfully.");
    }
}
