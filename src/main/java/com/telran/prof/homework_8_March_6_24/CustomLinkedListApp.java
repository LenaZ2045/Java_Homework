package com.telran.prof.homework_8_March_6_24;

import java.util.Iterator;

public class CustomLinkedListApp {

    public static void main(String[] args) {
        CustomLinkedList numberList = new CustomLinkedList();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(7);

        System.out.println("Original list = " + numberList);
        numberList.addFirst(0);
        System.out.println("Updated list with '0' added at the head (or first) = " + numberList);
        numberList.addByIndex(6, 6);
        System.out.println("Added element '6' to the list by index '6' = " + numberList);
        numberList.removeByIndex(0);
        System.out.println("Removed element by index '0' = " + numberList);

        Iterator<Integer> iterator = numberList.iterator();
        System.out.print("Printed list that executed over the iterator = ");
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(" " + next);
        }
    }
}