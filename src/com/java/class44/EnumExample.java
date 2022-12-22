package com.java.class44;

enum Days {
    SUNDAY("Holiday"), MONDAY("Working Day"), TUESDAY("Working Day"), WEDNESDAY("Working Day"), THURSDAY("Working Day"), FRIDAY("Working Day"), SATURDAY("Holiday");

    final String day;

    Days(String day) {
        this.day = day;
    }

    public String getDayWorkStatus(){
        return day;
    }
}


public class EnumExample {
    public static void main(String[] args) {
        String message = "Hello World";
        System.out.println(Days.SUNDAY);
    }
}
