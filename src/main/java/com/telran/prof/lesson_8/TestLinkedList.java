package com.telran.prof.lesson_8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {
        // linkedList - svazniy spisok
        // this is odnonapravleniy spisok

        // in Java - class LinkedList - this is dvynapravleniy cvazniy spisok

        // ArrayList VS LinkedList
        // in array elements are staging by next of each other
        // in linked list elements are placed not by order in different place in memory

        List<String> listOne = new ArrayList<>();
        listOne.add("One"); // index 0 element 1
        listOne.add("Two"); // index 1 elemn
        listOne.add("Three"); // index 2
        // get(index) - O(1) constant clojnost
        System.out.println(listOne.get(1));

        List<String> listTwo = new LinkedList<>();
        listTwo.add("One");
        listTwo.add("Two");
        listTwo.add("Three");
        // get(index) - O(n) clojnost
        System.out.println(listTwo.get(1));
        // add(index, element) - O(n) linear clojnost
        // if I have 1m elements to add by index 0 -> 1 need to move all 999999 elements to the right
        listOne.add(0, "Four");
        // add(index, element) - O(1) executes adding quickly by constant
        // 1m - for linked list - add by index 0 -> get ref to head; new element ->head ->next ->oldHead
        listTwo.add(0, "Four");
    }
}