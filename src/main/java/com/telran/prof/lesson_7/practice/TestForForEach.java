package com.telran.prof.lesson_7.practice;

import java.util.Arrays;
import java.util.List;

public class TestForForEach {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");

        for(String value : list) {
            System.out.print(" " + value);
        }
        System.out.println();

        list.forEach(value -> {
            System.out.print(" " + value);
        });
        System.out.println();

        //
         long startTime = System.currentTimeMillis();
         for (String value : list) {
             System.out.print(" " + value);
         }
         long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time to execute is : " + (endTime - startTime));
    }
}