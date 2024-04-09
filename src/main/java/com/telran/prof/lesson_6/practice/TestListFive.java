package com.telran.prof.lesson_6.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListFive {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("RED");
        list1.add("WHITE");

        List<String> list2 = new ArrayList<>();
        list2.add("YELLOW");
        list2.add("BLACK");
        list2.add("RED");

        list1.addAll(list2);
        System.out.println(list1);

        System.out.println("Is this list empty? " + list1.isEmpty());

        List<Colors> colors = new ArrayList<>();
        colors.add(Colors.BLACK);
        colors.add(Colors.RED);
        colors.add(Colors.WHITE);

        List<Colors> colorsList = Arrays.asList(Colors.RED, Colors.BLACK, Colors.WHITE);
        System.out.println(colorsList);

        List<String> lst = List.of("Red", "White"); // this type list which only can be viewed
    }
}