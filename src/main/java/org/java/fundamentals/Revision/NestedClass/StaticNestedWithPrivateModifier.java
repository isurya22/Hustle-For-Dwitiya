package org.java.fundamentals.Revision.NestedClass;

public class StaticNestedWithPrivateModifier {

        int variable = 10;
        static int age = 20;

        private static class NestedWithPrivateModifier{
            public void display(){
                System.out.println(age);
            }
        }

        public void print(){
            NestedWithPrivateModifier nwpm = new NestedWithPrivateModifier();
            nwpm.display();
        }

    public static void main(String[] args) {
        StaticNestedWithPrivateModifier.NestedWithPrivateModifier vary = new StaticNestedWithPrivateModifier.NestedWithPrivateModifier();
        vary.display();
        StaticNestedWithPrivateModifier vary2 = new StaticNestedWithPrivateModifier();
        vary2.print();
        System.out.println(vary2.variable);
    }
}
