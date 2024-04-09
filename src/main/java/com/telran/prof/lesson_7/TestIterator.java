package com.telran.prof.lesson_7;

import java.util.*;

public class TestIterator {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        Iterator<String> iterator = list.iterator();
        System.out.println("List of elements : ");
        String next = iterator.next();
        String next1 = iterator.next();
        System.out.println(next);
        System.out.println(next1);

        // -> A B C D E:
        // next(); // A
        // A -> B C D E
        // next(); // B
        // A B -> C D E
        // next(); // C
        // A B C -> D E
        // next(); // D
        // A B C D -> E
        // next(); // E
        // A B C D E ->

        boolean b = iterator.hasNext();

        while (iterator.hasNext()) {
            String next2 = iterator.next();
            System.out.print(" " + next2);

        }
    }
}
