package com.telran.prof.homework_7_March_4_24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsLists {

    public static void main(String[] args) {

        List<Integer> millionElements = new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            millionElements.add(i);
        }
        System.out.println("Created a list with one million elements " + millionElements.size());

        System.out.println(" 1 ");
        Iterator<Integer> iterator1 = millionElements.iterator();
        int temp1 = 0;
        long startTime1 = System.currentTimeMillis();
        for (int i : millionElements) {
            temp1 = i;
            iterator1.next();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime1 - startTime1));
        System.out.println("Iterated over the list with " + temp1 + " elements by FOR-EACH LOOP");

        System.out.println(" 2 ");
        Iterator<Integer> iterator2 = millionElements.iterator();
        int temp2 = 0;
        long startTime2 = System.currentTimeMillis();
        for (int i = 1; i <= millionElements.size(); i++) {
            temp2 = i;
            iterator2.next();
            millionElements.size();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime2 - startTime2));
        System.out.println("Iterated over the " + temp2 + " elements by CLASSIC FOR with size call");

        System.out.println(" 3 ");
        Iterator<Integer> iterator3 = millionElements.iterator();
        int temp3 = 0;
        int size = 0;
        long startTime3 = System.currentTimeMillis();
        for (int i = 1; i <= millionElements.size(); i++) {
            temp3 = i;
            size = millionElements.size();
            iterator3.next();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime3 - startTime3));
        System.out.println("Iterated over the " + temp3 + " million elements by CLASSIC FOR + temp variable is the list.size() " + size);

        System.out.println(" 4 ");
        Iterator<Integer> iterator4 = millionElements.iterator();
        int temp4 = 0;
        int size1 = 0;
        long startTime4 = System.currentTimeMillis();
        for (int i = 1000000; i <= millionElements.size(); i--) {
            temp4 = i;
            size1 = millionElements.size();
            iterator4.hasNext();
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime4 - startTime4));
        System.out.println("Iterated over " + temp4 + " million elements by CLASSIC FOR + temp variable is the list.size() " + size1 + " million iterations going backward!");

        System.out.println(" 5 ");
        Iterator<Integer> iterator5 = millionElements.iterator();
        int value = 0;
        int num = 0;
        long startTime5 = System.currentTimeMillis();
        while (iterator5.hasNext()) {
            num = iterator5.next();
            value++;
        }
        long endTime5 = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime5 - startTime5));
        System.out.println("Used ITERATOR to go over " + value + " million elements repeated " + num + " iterations");

        System.out.println(" 6 ");
        Iterator<Integer> iterator6 = millionElements.listIterator();
        int count = 0;
        int sum = 0;
        long startTime6 = System.currentTimeMillis();
        while (iterator6.hasNext()) {
            sum = iterator6.next();
            count++;
        }
        long endTime6 = System.currentTimeMillis();
        System.out.println("Time to execute = " + (endTime6 - startTime6));
        System.out.println("Used lIST-ITERATOR to go over " + count + " million elements " + sum + " iterations");
    }
}