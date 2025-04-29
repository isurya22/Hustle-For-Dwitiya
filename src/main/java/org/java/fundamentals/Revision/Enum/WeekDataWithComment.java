package org.java.fundamentals.Revision.Enum;

public enum WeekDataWithComment {
    MONDAY(101,"1st day of the week"),
    TUESDAY(102,"2nd Day of week"),
    WEDNESDAY(103,"3rd day of week"),
    THURSDAY(104,"4th Day of week"),
    FRIDAY(105,"5th Day of week"),
    SATURDAY(106,"6th Day of Week"),
    SUNDAY(107,"7th Day of week");

    private int val;
    private String comment;

    //By the default this constructor is private.
    WeekDataWithComment(int val,String comment){
        this.val = val;
        this.comment = comment;
    }

    public int getNumber(){
        return val;
    }

    public String getComment(){
        return comment;
    }

    public static WeekDataWithComment getInfoOfWeek(int value){
        for(WeekDataWithComment weekData : WeekDataWithComment.values()){
            if (weekData.val == value){
                return weekData;
            }
        }
        return null;
    }
}
