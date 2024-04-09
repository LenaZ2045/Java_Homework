package com.telran.prof.lesson_6;

import java.util.ArrayList;

public class TestListThree {

    public static void main(String[] args) {
        ArrayList<String> listStringArray = new ArrayList<>();
        ArrayList<Integer> listIntegerArray = new ArrayList<>();

        listStringArray.add("Hello");
        listStringArray.add("Hey");
        System.out.println(listStringArray);

        listIntegerArray.add(5);
        listIntegerArray.add(15);
        System.out.println(listIntegerArray);

        listStringArray.remove("Hey");
        System.out.println(listStringArray);

        listIntegerArray.remove(Integer.valueOf(5));
        System.out.println(listIntegerArray);
    }
}