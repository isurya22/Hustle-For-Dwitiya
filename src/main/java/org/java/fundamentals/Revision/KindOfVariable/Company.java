package org.java.fundamentals.Revision.KindOfVariable;

public class Company {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.dummyMethod();

        Employee b = new Employee(100021);
        System.out.println(b.employeeId);


        System.out.println(Employee.employeeName);
    }
}
