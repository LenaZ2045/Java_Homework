package com.telran.prof.lesson_4.exampleENUM;

import java.util.Scanner;

public class PassportCheck {
    public static void main(String[] args) {
        System.out.println("input passport year of issue");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Passport passport = null;
        PassportType[] values = PassportType.values();
        for(PassportType value : values) {
            if(year >= value.getStartYear() && year <= value.getEndYear()) {
                passport = new Passport(value);
            }
        }
        System.out.println("Passport is " + passport);

    }
}
