package com.telran.prof.lesson_21;

import java.time.*;
import java.util.Set;

public class ZoneExample {

    public static void main(String[] args) {
        ZonedDateTime now  = ZonedDateTime.now();
        System.out.println(now);
        ZonedDateTime parse = ZonedDateTime.parse("2024-05-06T14:06:05.240299300-04:00[America/New_York]");
        System.out.println(parse);

        Set<String> avalableZoneIds = ZoneId.getAvailableZoneIds();
        for(String zone : avalableZoneIds) {
            System.out.println(zone);
        }

        ZonedDateTime of = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Asia/yerevan"));
        ZonedDateTime of1 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Pacific/Guadalcanal"));
        System.out.println(of);
        System.out.println(of1);
    }
}