package org.java.Interface.Revision.Reflection;

import java.lang.reflect.Method;

public class Forest {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Class<? extends Elephant> childElephant = elephant.getClass();
        Method[] methods = childElephant.getDeclaredMethods();
        for (Method method : methods){
            System.out.println("Method name is: "+method.getName());
            System.out.println("Return type: "+method.getReturnType());
            System.out.println("Class Name: "+method.getDeclaringClass());
            System.out.println("*****");
        }
    }
}
