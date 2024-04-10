package com.telran.prof.lesson_16.studentlib;

import java.util.Arrays;
import java.util.List;

public class OperatorExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "100", "10", "15", "50");

        // anyMatch - terminal
        System.out.println(list.stream().anyMatch(s-> "10".equals(s)));

        // allMatch - terminal
        System.out.println(list.stream().allMatch(s-> s instanceof String));

        //min - terminal
        System.out.println("Result of min is " + list.stream()
                .min((s1, s2) -> s1.compareTo(s2)).orElse(" "));

//        findFirst - terminal

        List<Integer> list1 = Arrays.asList(2, 4, 5, 6, 8);
        System.out.println("first elemnt after filter is " +
                .list1.stream()
                .filter(integer -> integer > 7)
                .findFirst()
                .orElse(0)); // optional

        String[] objects = list.stream().toArray(String[]::new); // Object gives
        String[] arrays2 = list. stream().toArray(value -> new String[value]);

    }
}