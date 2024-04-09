package com.telran.prof.lesson_12;

import java.util.*;

public class ExampleMapTwo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        //put time complexity O(1) depends on functions by object
        map.put("a", 100); // a->100
        map.put("b", 200); // b->200
        map.put("c", 300); // c->300
        map.put("d", 400); // d->400

        Set<String> stringSet = map.keySet();
        Collection<Integer> values = map.values();

        Set<String> stringSet1 = new TreeSet<>();
        Map<String, Integer> mapTwo = new TreeMap<>();
        mapTwo.put("b", 200); // a->100
        mapTwo.put("c", 100); // b->200
        mapTwo.put("a", 300); // c->300
        mapTwo.forEach((key, value) -> {
            System.out.println(" " + key + " : " + value);
        });
    }
}