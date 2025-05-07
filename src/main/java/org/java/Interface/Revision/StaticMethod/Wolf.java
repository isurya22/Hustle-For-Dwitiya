package org.java.Interface.Revision.StaticMethod;

public class Wolf implements Bird{
    public void canRunorFly(){
        if(Bird.canBreathe()){
            System.out.println("It can't fly");
        }
        System.out.println("But it would run");
    }
}
