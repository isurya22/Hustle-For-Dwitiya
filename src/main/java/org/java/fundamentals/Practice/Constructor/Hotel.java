package org.java.fundamentals.Practice.Constructor;

public class Hotel {

    Hotel(){
        int age = 18;
        String gender = "Female";
        System.out.println("Age should be: "+age);
        System.out.println("Gender should be: "+gender);
    }

    Hotel(String name){
        System.out.println(name);
    }

}
