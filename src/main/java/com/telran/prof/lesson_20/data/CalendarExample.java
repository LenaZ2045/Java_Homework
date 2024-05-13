package com.telran.prof.lesson_20.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        System.out.println();
        GregorianCalendar day = new GregorianCalendar(2021, Calendar.APRIL, 27);
        System.out.println(day);

        System.out.println("Current month" +day.get(Calendar.MONTH));
        System.out.println(day.get(Calendar.YEAR));
        System.out.println(day.get(Calendar.DAY_OF_YEAR));
        System.out.println(day.get(6));

        day.set(2020, Calendar.MAY, 23); // set our own parameters
        System.out.println(day);

        day.add(Calendar.MONTH, 5);
        day.add(Calendar.DATE, 10);
        System.out.println(day);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = day.getTime();
        String formatDate = simpleDateFormat.format(date);
        System.out.println(formatDate);

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(Calendar.getInstance().getTime()));
    }
}