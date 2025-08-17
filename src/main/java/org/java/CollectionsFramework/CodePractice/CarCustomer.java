package org.java.CollectionsFramework.CodePractice;


import java.util.Arrays;

public class CarCustomer {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("AUDI","PETROL");
        cars[1] = new Car("MERCEDES","Petrol");
        cars[2] = new Car("MAHINDRA", "EV");

        Arrays.sort(cars,(Car c1,Car c2)->c1.carType.compareTo(c2.carType));

        for(Car car : cars){
            System.out.println(car.carBrandName +"....."+car.carType);
        }

    }
}
