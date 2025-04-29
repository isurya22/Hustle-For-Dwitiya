package org.java.fundamentals.Revision.Enum;

public enum ExampleMethodOverRide {
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Don't want to work/go to office !");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public void dummyMethod(){
        System.out.println("Working space is same !!!");
    }
}
