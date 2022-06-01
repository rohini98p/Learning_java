package com.rohini.enaum;

public enum WeekDays {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);



    int day;
    WeekDays(int day){
        this.day=day;
    }

    public int getDay() {
        return day;
    }
}
