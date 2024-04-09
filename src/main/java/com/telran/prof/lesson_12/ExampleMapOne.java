package com.telran.prof.lesson_12;

import java.util.HashMap;
import java.util.Map;

public class ExampleMapOne {

    public static void main(String[] args) {
        String test = "afsljdruipweqcxnvnzcnmahjkyuiopqwert";
        ExampleMapOne exampleMapOne = new ExampleMapOne();
        Map<Character, Integer> mapOne = exampleMapOne.countLettersInString(test);
        printMap(mapOne);
        System.out.println();
        Map<Character, Integer> mapTwo = exampleMapOne.countLettersInStringTwo(test);
        printMap(mapTwo);
    }

    private static void printMap(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.println("Letter " + pair.getKey() + " contains " + pair.getValue() + " times");
        }
    }


    public Map<Character, Integer> countLettersInString(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            // getting chars from strings by order-queue
            char temp = test.charAt(i);
            // checks if key in kind of char is available
            if (map.containsKey(temp)) {
                // if key is available we receive meaning count for that key
                Integer value = map.get(temp);
                // input back meaning increased by 1 for the same key
                map.put(temp, value + 1);
            } else {
                // if no key or only one then adds it meaning like only one char (unique)
                map.put(temp, 1);
            }
        }
        return map;
    }

    public Map<Character, Integer> countLettersInStringTwo(String test) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < test.length(); i++) {
            // getting chars from strings by order-queue
            char temp = test.charAt(i);
            // receives meaning by key, if no kay available then it returns default meaning and inters it back to same key
            int value = map.getOrDefault(temp, 0); // wide method
            map.put(temp, value + 1);
        }
        return map;
    }
}