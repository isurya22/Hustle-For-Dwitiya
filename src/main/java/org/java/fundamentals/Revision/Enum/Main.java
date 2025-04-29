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
    }
}
