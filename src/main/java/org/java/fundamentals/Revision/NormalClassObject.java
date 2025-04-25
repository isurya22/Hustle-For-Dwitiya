package org.java.fundamentals.Revision;

public class NormalClassObject
{
    public int age = 22;
    String course = "B.Tech";
    String name;

    void completedBtech(String name){
        //this.name=name;
        System.out.println("The bachlor name is "+name);
        System.out.println(age);
        System.out.println(course);
    }

    public static void main(String[] args) {
        NormalClassObject bachlor = new NormalClassObject();
        bachlor.completedBtech("Ajith");
    }
}
