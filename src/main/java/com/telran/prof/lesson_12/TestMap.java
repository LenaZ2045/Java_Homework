package com.telran.prof.lesson_12;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        // INTERFACES
        // List - ArrayList, LinkedList
        // Set - TreeSet, HashSet
        // Queue - PriorityQueue, ArrayDeque, Stack

        // TODAY Map - (key, value) is interface

        Map<String, Integer> map = new HashMap<>();
        //put time complexity O(1) depends on functions by object
        map.put("a", 100); // a->100
        map.put("b", 200); // b->200
        map.put("c", 300); // c->300
        map.put("d", 400); // d->400

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Key : " + key + "; Value : " + value);
        }

        map.forEach((key, value) -> {
            System.out.println("Key : " + key + "; Value : " + value);
        });

        // get time complexity O(1)
        Integer integer = map.get("c");
        System.out.println("Result value by key c is = " + integer);

        boolean e = map.containsKey("e");
        System.out.println("Is key E available? " + e);
    }
}