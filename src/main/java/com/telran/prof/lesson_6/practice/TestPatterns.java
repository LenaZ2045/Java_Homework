package com.telran.prof.lesson_6.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatterns {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("HELLO");
        stringList.add("I AM");
        stringList.add("WORLD");
        stringList.add("hi");
        TestPatterns testPatterns = new TestPatterns();

        System.out.println("Original list " + stringList);
        List<String> stringList1 = testPatterns.convertStringListToLowerCase(stringList);
        System.out.println("List in lower case : " + stringList1);
        System.out.println("Original list " + stringList);

        testPatterns.convertCurrentListToLowerCase(stringList);
        System.out.println("Original list " + stringList);

    }

    private List<String> convertStringListToLowerCase(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            newList.add(value.toLowerCase());
        }
        return newList;
    }

    private void convertCurrentListToLowerCase(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
    }
}