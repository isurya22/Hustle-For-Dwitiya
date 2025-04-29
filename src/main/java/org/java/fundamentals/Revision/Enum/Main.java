package org.java.fundamentals.Revision.Enum;

public class Main {
    public static void main(String[] args) {
        /*
            For Enum, common function which is used,
            - values()
            - ordinal()
            - valueOf()
            - name()
         */
        for(EnumSample obj : EnumSample.values()){
            System.out.println(obj.ordinal());
        }

        EnumSample enumVariable = EnumSample.valueOf("FRIDAY");
        System.out.println(enumVariable.name());

        WeekDataWithComment checking = WeekDataWithComment.getInfoOfWeek(106);
        System.out.println(checking.getComment());

        ExampleMethodOverRide dayCheck = ExampleMethodOverRide.THURSDAY;
        dayCheck.dummyMethod();

        ExampleMethodOverRide dayCheck2 = ExampleMethodOverRide.MONDAY;
        dayCheck2.dummyMethod();

        EnumWithAbstract_Method prayer = EnumWithAbstract_Method.SUNDAY;
        prayer.dummyMethod();

        EnumWithInterfaceOFMyInterface friend = EnumWithInterfaceOFMyInterface.ABINASH;
        System.out.println(friend.toLowerCase());
    }
}
