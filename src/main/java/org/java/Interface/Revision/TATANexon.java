package org.java.Interface.Revision;

public class TATANexon implements Car {

    @Override
    public void applyBreak() {
        System.out.println("This is default feature 1");
    }

    @Override
    public void doAccelerate() {
        System.out.println("This is default feature 2");
    }

    @Override
    public void digitalConnectivity() {
        System.out.println("AI feature with good display IpAD");
    }
}
