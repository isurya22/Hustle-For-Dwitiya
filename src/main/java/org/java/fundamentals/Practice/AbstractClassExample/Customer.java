package org.java.fundamentals.Practice.AbstractClassExample;

public class Customer {
    public static void main(String[] args) {
        Car car = new TATA();
        car.applyBreak();
        car.applyAccelerator();
        car.fillGas("Petrol");
        //car.haveDigitalMeter();
    }
}
