package com.telran.prof.lesson_20.data;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        // 1 Jan 1970 03-00 when started to calculate it in our system

        Date dateOne = new Date(); // current date
        System.out.println(dateOne);
        System.out.println(dateOne.getTime());
        Date dateTwo = new Date(1714416778434L);
        System.out.println(dateTwo);
        Date dateThree = new Date(2021 - 1900, 05 - 1, 14);
        System.out.println(dateThree);

        System.out.println("Date two comes after after one, true? = " + dateTwo.after(dateOne));
        System.out.println("Date two comes after after one, true? = " + dateTwo.before(dateOne));
        System.out.println("Date two compare date one " + dateTwo.compareTo(dateOne));

        System.out.println("Mills from 01 Jan 1970 to date one is " + dateOne.getTime());
    }
}