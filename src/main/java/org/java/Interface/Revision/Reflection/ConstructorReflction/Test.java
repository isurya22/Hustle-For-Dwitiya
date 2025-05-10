package org.java.Interface.Revision.Reflection.ConstructorReflction;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class Test {

    public static void main(String[] args) {
        Class<Eagle> eagleClass = Eagle.class;

        Constructor[] constructors = eagleClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println("Modifier: "+ Modifier.toString(constructor.getModifiers()));
            System.out.println("****");
        }

    }
}
