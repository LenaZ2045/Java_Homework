package com.telran.prof.lesson_6.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternsTwoExampleTwo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("HELLO");
        stringList.add("I AM");
        stringList.add("WORLD");
        stringList.add("hi");
        stringList.add("HELLO");
        stringList.add("I");
        stringList.add("WORLD");
        stringList.add("help");
        System.out.println(stringList);
        TestPatternsTwoExampleTwo exampleTwo = new TestPatternsTwoExampleTwo();
        List<String> uniqueStrinList = exampleTwo.getUniqueStrinList(stringList);
        System.out.println(uniqueStrinList);
    }

    private List<String> getUniqueStrinList(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            boolean contains = newList.contains(value);
            if (!contains) {
                newList.add(value);
            }
        }
        return newList;
    }
}