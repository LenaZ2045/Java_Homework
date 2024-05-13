package com.telran.prof.lesson_21;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        //LocalTime
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        int nano = currentTime.getNano();
        System.out.printf("%d - %d - %d - %d \n", hour, minute, second, nano);

        currentTime.plusHours(4);
        currentTime.plusMinutes(20);
        System.out.println(currentTime);
    }
}