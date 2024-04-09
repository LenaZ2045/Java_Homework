package com.telran.prof.lesson_4.exampleENUM;

import java.util.Arrays;

public class EnumExample {

    public static String helloPhrase = "Hi!";
    public static void main(String[] args) {
        DaysOfWeek[] values = DaysOfWeek.values();
        System.out.println(Arrays.toString(values));

        String monday = "MONDAY";
        DaysOfWeek daysOfWeek = DaysOfWeek.valueOf(monday);
        System.out.println(daysOfWeek);

        int ordinalIndex = DaysOfWeek.MONDAY.ordinal();
        System.out.println(ordinalIndex);
        checkDay(DaysOfWeek.THURSDAY.ordinal());
    }
    public static void checkDay(int index) {
        if(index == 4) {
            System.out.println("start all");
        }
    }
}
