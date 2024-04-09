package com.telran.prof.lesson_7;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "E");
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Elements in forward direction : ");
        while(iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println();
        System.out.println("Elements in backward direction : ");
        while (iterator.hasPrevious()) {
            System.out.print(" " + iterator.previous());
        }
    }
}
