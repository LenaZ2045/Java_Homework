package com.telran.prof.lesson_21;

import java.time.*;

public class TaskExample {

    public static void main(String[] args) {
        // check that date 10 Jan 1985 is Friday
        // minus 10 years and print to console
        // get object ZoneDateTime for 01.01.1980 20-00-00 Pacific/Midway
        LocalDate date = LocalDate.of(1985, 1, 10);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        DayOfWeek friday = DayOfWeek.FRIDAY;
        System.out.println("Is day of the week is Friday? " + (friday == dayOfWeek));

        LocalDate minus10Years = date.minusYears(10);
        System.out.println(minus10Years);

        ZonedDateTime of = ZonedDateTime.of(LocalDate.of(1980, 01, 01), LocalTime.of(20, 00, 00), ZoneId.of("Pacific/Midway"));
        System.out.println(of);

    }
}