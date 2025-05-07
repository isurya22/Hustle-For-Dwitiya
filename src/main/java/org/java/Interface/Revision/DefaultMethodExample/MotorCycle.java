package org.java.Interface.Revision.DefaultMethodExample;

public interface MotorCycle {

    default void needFuel(){
        System.out.println("It needs Petrol");
    }
}
