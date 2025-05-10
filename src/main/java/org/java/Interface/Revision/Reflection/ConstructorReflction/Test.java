package org.java.Interface.Revision.Reflection.ConstructorReflction;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Test {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Eagle> eagleClass = Eagle.class;

        Constructor[] constructors = eagleClass.getDeclaredConstructors();
        for (Constructor constructor : constructors){
            System.out.println("Modifier: "+ Modifier.toString(constructor.getModifiers()));
            System.out.println("****");

            /*
              With help of reflection of constructor you can access private constructor and create a new object.
             */
            constructor.setAccessible(true);
            Eagle eagle = (Eagle) constructor.newInstance(); //constructor called here.
            eagle.fly();
        }

    }
}
