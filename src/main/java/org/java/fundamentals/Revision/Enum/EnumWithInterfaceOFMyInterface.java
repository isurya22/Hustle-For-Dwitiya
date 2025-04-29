package org.java.fundamentals.Revision.Enum;

public enum EnumWithInterfaceOFMyInterface implements MyInterface {
    SURYA,
    ANURAG,
    RAKESH,
    ABINASH,
    AMIYA;


    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
