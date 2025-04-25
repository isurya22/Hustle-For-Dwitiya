package org.java.fundamentals.Revision.NestedClass;

public class StaticNested {

    static int age = 30;
    double temp = 32.10;

    //This below class is Nested Static Class.
    static class StaticNestedExample{
        public void print(){
            System.out.println(age);
            //Here you can't call the non-static variable temp under static class.
            //System.out.println(temp);
        }
    }

    public static void main(String[] args) {
        StaticNested.StaticNestedExample example = new StaticNested.StaticNestedExample();
        example.print();
        StaticNested example2 = new StaticNested();
        System.out.println(example2.temp);
    }
}
