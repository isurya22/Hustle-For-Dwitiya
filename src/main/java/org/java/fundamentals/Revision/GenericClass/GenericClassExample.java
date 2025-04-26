package org.java.fundamentals.Revision.GenericClass;

import org.java.fundamentals.Revision.Constructor.Student;

public class GenericClassExample {

    Object value;

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public static void main(String[] args) {
        GenericClassExample obj1 = new GenericClassExample();
        obj1.setValue(10);
        Object value = obj1.getValue();
        System.out.println(value);
        //Here we have typecasting the Object value. If suppose that is not integer then impossible to typecast. That's why Generic class came to avoid this problem.
        if((int)value != 1){
            System.out.println("It is not 1");
        }
    }
}
