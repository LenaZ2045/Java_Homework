package com.telran.prof.lesson_9;

import java.util.Set;
import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args) {
        //Set interface
        //SortedSet, NavigableSet - interface
        //TreeSet, HashSet

        //TreeSet - saves only unique elements, no order but has sorter

        //HashSet - saves only unique elements, no order

        //ArrayList get0(1), contains O(n) - Arr, linear list
        // add, remove, contains - O(log(n))
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("a");
        stringSet.add("b");

        System.out.println(stringSet);
        System.out.println("Set contains 'C' " +stringSet.contains("c"));

    }
}
