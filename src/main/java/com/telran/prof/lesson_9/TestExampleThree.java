package com.telran.prof.lesson_9;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestExampleThree {

    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>(); // only SEt methods are available
        SortedSet<String> stringSortedSet = new TreeSet<>();
        stringSet.add("b");
        stringSet.add("c");
        stringSet.add("a");

        stringSortedSet.add("b");
        stringSortedSet.add("c");
        stringSortedSet.add("a");

        System.out.println(stringSet);
        System.out.println("First element " + stringSortedSet.first());
        System.out.println("last element " + stringSortedSet.last());

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
    }
}
