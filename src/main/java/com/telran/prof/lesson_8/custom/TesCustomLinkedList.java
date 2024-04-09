package com.telran.prof.lesson_8.custom;

public class TesCustomLinkedList {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);
//        list.print();
        System.out.println(list);

        list.addFirst(10);
        list.addFirst(15);

        System.out.println(list);
        System.out.println("Size of the linked list " + list.size());
        list.addByIndex(1, 20);
        System.out.println(list);
        list.addByIndex(4, 35);
        System.out.println(list);
        list.size();
    }
}