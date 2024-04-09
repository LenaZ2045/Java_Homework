package com.telran.prof.lesson_9;

import java.util.HashSet;
import java.util.Set;

public class TestExampleFive {

    public static void main(String[] args) {
        // add, remove, contains - O(1)
        Set<String> stringSet = new HashSet<>();
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("a");
        stringSet.add("b");
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("World");

        System.out.println(stringSet);
    }
}
