package com.telran.prof.lesson_7;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

    public static void main(String[] args) {
        // Vector, HashTable, Dictionary, Properties, Stack

        Vector<Integer> vector = new Vector<>();
        for ( int i = 0; i < 10; i++) {
            vector.addElement(i);
        }
        System.out.println(vector);

        Enumeration<Integer> elements = vector.elements();
        while (elements.hasMoreElements()) {
            int value = elements.nextElement();
            System.out.print(" " + value);
        }
    }
}