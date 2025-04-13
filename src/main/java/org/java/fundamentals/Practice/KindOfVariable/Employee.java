package org.java.fundamentals.Practice.KindOfVariable;

public class Employee {

    //Instance Variable
    int employeeId;

    //Static reference
    static String employeeName;

    //Default Constructor
    Employee(){

    }

    //Parameterised Constructor
    Employee(int employeeId){
        this.employeeId = employeeId;
    }

    //Instance Method
    void dummyMethod() {
        String joined = "NewJoinee"; //local Variable
        System.out.println(joined);
    }
}

