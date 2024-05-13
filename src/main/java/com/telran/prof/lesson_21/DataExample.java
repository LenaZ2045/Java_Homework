package com.telran.prof.lesson_21;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DataExample {

    public static void main(String[] args) {
        //LocalDate
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        System.out.println(currentDate.getDayOfWeek());
        int year = currentDate.getYear();
        Month month = currentDate.getMonth();
        int dayOfMonth = currentDate.getDayOfMonth();
        int monthValue = currentDate.getMonthValue();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.printf("%d.%d.%d\n", dayOfMonth, monthValue, year); // printf

        LocalDate date = LocalDate.of(2024, 02, 02);
        System.out.println(date);

        LocalDate plusYears = date.plusYears(2);
        System.out.println(plusYears);
        date = date.plusDays(5);
        date = date.plusMonths(5);
        System.out.println(date);

        date = date.minusDays(10);
        date = date.minusYears(10);
        System.out.println(date);
    }
}
