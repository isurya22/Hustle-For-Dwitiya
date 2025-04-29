package org.java.fundamentals.Revision.Enum;

public enum EnumWithAbstract_Method {
    FRIDAY{
        public void dummyMethod(){
            System.out.println("Mosque Time");
        }
    },
    SATURDAY{
        public void dummyMethod(){
            System.out.println("Temple Time");
        }
    },
    SUNDAY{
        public void dummyMethod(){
            System.out.println("Church Time");
        }
    };

    public abstract void dummyMethod();
}
