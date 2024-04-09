package com.telran.prof.lesson_11.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleArrayDeque {

    public static void main(String[] args) {
        // FIFO - first input first output
        Deque<String> strings = new ArrayDeque<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        // three->two->one
        strings.addFirst("Four");
        strings.addLast("Five");
        System.out.println(strings);

        //one, two, three
        System.out.println(strings.pollFirst());
        System.out.println(strings.pollLast());
        System.out.println(strings.poll());
        System.out.println(strings.poll());
        System.out.println(strings.poll());

    }
}