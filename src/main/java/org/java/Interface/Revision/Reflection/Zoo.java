package org.java.Interface.Revision.Reflection;

import java.lang.reflect.Method;

public class Zoo {
    public static void main(String[] args) {
        //Class tiger = Class.forName("Tiger");
        Class<Tiger> tiger = Tiger.class;
        Method[] methods = tiger.getMethods();
        for(Method method : methods){
            System.out.println("Method name is: "+ method.getName());
            System.out.println("Method return type: "+method.getReturnType());
            System.out.println("Class Name: "+method.getDeclaringClass());
        }
    }
}
