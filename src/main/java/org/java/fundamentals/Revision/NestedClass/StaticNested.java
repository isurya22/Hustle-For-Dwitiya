package org.java.fundamentals.Revision.NestedClass;

public class StaticNested {

    static int age = 30;

    //This below class is Nested Static Class.
    static class StaticNestedExample{
        public void print(){
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        StaticNested.StaticNestedExample example = new StaticNested.StaticNestedExample();
        example.print();
    }
}
