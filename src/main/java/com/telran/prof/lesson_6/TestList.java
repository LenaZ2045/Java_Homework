package com.telran.prof.lesson_6;

import java.util.ArrayList;

public class TestList {

    public static void main(String[] args) {
        // List - its interface
        // ArrayList - dynamic array, called also list
        // array - elementData, size = 10
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Hello"); // 0 index
        listOne.add("I"); // 1 index
        listOne.add("am"); // 2
        listOne.add("Java"); // 3
        listOne.add("Hello"); // 4
        listOne.add("I"); // 5
        listOne.add("am"); // 6
        listOne.add("Java"); // 7
        listOne.add("Hello"); // 8
        listOne.add("I"); // 9
        // size * 1,5 = 15;
        // all meanings will be copied from old array to the new array
        // System.arraycopy
        // elementData = new array with size 15
        listOne.add("am"); // 10
        listOne.add("Java"); // 11

        System.out.println(listOne);
        System.out.println(listOne.size());

        for (String element : listOne) {
            System.out.println(element);
        }

        //get() - get element
        String elementIndex2 = listOne.get(2);
        System.out.println(elementIndex2);

        for (int i = 0; i < listOne.size(); i++) {
            System.out.println("Element by index " + i + " = " + listOne.get(i));
        }
    }
}