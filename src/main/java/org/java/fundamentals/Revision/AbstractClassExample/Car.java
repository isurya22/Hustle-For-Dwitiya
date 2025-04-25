package org.java.fundamentals.Revision.AbstractClassExample;

import java.util.Objects;

public abstract class Car {
    //String Gas = "Petrol";

    public abstract void applyAccelerator();

    public abstract void applyBreak();

    public void fillGas(String Gas){
        if(Objects.equals(Gas, "Petrol")){
            System.out.println("It will take: "+Gas);
        } else {
            System.out.println("Another Gas is not available.");
        }

    }
}
