package org.java.CollectionsFramework.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingWithTwoObjects {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("SUV", "Electric"));
        carList.add(new Car("Hatchback","Petrol"));
        carList.add(new Car("SuperCar","HydrogenGas"));

        Collections.sort(carList,(Car car1, Car car2)->car2.carName.compareTo(car1.carName));

        carList.forEach((Car car)-> System.out.println(car.carName+"..."+car.carType));
    }
}
