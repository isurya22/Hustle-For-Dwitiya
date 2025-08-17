package org.java.CollectionsFramework.Comparable;

import java.util.Arrays;

public class AscendingWithTwoObjectsExample2 {
    public static void main(String[] args) {

        Car[] carList = new Car[3];

        carList[0] = new Car("TATA","Hybrid");
        carList[1] = new Car("MAHINDRA", "Petrol");
        carList[2] = new Car("Tesla","Cng");

        Arrays.sort(carList,(Car c1, Car c2)->c1.carType.compareTo(c2.carType));

        for (Car car : carList){
            System.out.println(car.carName+"...."+car.carType);
        }
    }
}
