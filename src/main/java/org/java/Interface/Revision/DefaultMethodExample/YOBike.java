package org.java.Interface.Revision.DefaultMethodExample;

public class YOBike implements EVBike{
    @Override
    public void needElectricity() {
        System.out.println("It needs charger");
    }
}
