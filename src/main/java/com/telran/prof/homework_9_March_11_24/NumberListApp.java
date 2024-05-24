package com.telran.prof.homework_9_March_11_24;

import java.util.*;

public class NumberListApp {

    public static void main(String[] args) {
        Random randomNumbers = new Random(); // through this setting we pick random numbers
        int count = 0; // controller for the size
        Set<Integer> uniqueSortedNumbers = new TreeSet<>(); // TreeSet keeps elements in sorted order / Set deletes duplicates

        for (int i = 0; i < 100; i++) {
            int element = randomNumbers.nextInt(10); // our list diapason from 0 to 9
            uniqueSortedNumbers.add(element); // adding my elements into TreeSet
            System.out.print(" " + element); // printing elements into console
            count++; // calculating size
        }
        System.out.println();
        System.out.println("Random numbers quantity = " + count);

        System.out.println("Unique sorted numbers are : ");
        for (int num : uniqueSortedNumbers) { // forEach cycle will execute TreeSet rules
            System.out.print(" " + num);
        }

        System.out.println();
        Set<Integer> onlyUniqueNumbers = new HashSet<>(); // HashSet keeps element unsorted order Set keeps unique elements
        int counter = 0; // controller for each operation
        for (int i = 0; i < 100; i++) {
            int element = randomNumbers.nextInt(10, 20); // our list diapason from 10 tp 19
            onlyUniqueNumbers.add(element); // adding my elements nto HashSet
            System.out.print(" " + element); // printing each element into console
            counter++; // calculating size
        }
        System.out.println();
        System.out.println("Random numbers quantity = " + counter);

        System.out.println("Only unique numbers are : ");
        for (int num : onlyUniqueNumbers) { // forEach cycle will execute HashSet rules
            System.out.print(" " + num);
        }
    }

    @Override
    public String toString() {
        return "NumberListApp{}";
    }
}