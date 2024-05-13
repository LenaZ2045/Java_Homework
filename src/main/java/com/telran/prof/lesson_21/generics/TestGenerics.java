package com.telran.prof.lesson_21.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestGenerics {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();

        List list = new ArrayList<>();
        list.add("I like ");
//        Object o = list.get(0);
//        String text = list.get(0) + " generics! "; // concatenate to string
        String text = (String) list.get(0); // + " generics! "; // concatenate to string
        System.out.println(text);

        List listOne = new ArrayList<>(); // input for safety <String> generics for compilation of our code
        listOne.add("Java"); // type is String
        listOne.add(1); // type is int
        for (Object str : listOne) {
            System.out.println((String) str); // Exception rules mistake ClassCastException
        }


    }
}