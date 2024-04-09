package com.telran.prof.lesson_6.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternTwo {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("HELLO");
        stringList.add("I AM");
        stringList.add("WORLD");
        stringList.add("hi");
        int length = 5;
        TestPatternTwo testPatternTwo = new TestPatternTwo();
        List<String> filteredStringListBYSize = testPatternTwo.getFilteredStringListBYSize(stringList, length);
        System.out.println(filteredStringListBYSize);

    }

    private List<String> getFilteredStringListBYSize(List<String> list, int size) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            if (value.length() == size) {
                newList.add(value);
            }
        }
        return newList;
    }
}