package org.java.CollectionsFramework.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingWithTwoObjects {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("SUV","petrol"));
        carList.add(new Car("sedan","disel"));
        carList.add(new Car("hatchback","cng"));

        Collections.sort(carList,(Car c1, Car c2)->c1.carType.compareTo(c2.carType));

        carList.forEach((Car c)-> System.out.println(c.carName +"....."+c.carType));  //Display wrong output
    }
}
