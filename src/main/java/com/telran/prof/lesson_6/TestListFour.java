package com.telran.prof.lesson_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestListFour {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        List<String> list = new ArrayList<>(); // array list
        TestListFour testListFour = new TestListFour();
        testListFour.addElementsInReverseOrder(list);
        List<String> list1 = new LinkedList<>(); // linked list
        testListFour.addElementsInReverseOrder(list1);
    }

    private void addElementsInReverseOrder(List<String> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, " " + i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time to execute " + (endTime - startTime));
    }
}