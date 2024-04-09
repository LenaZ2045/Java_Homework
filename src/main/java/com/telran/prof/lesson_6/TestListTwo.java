package com.telran.prof.lesson_6;

import java.util.ArrayList;

public class TestListTwo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(list);
        list.add(0, 3); // 3, 4, 5, 6
        System.out.println(list);
        list.add(0, 4);
        list.add(0, 5);
        list.add(0, 6);
        System.out.println(list);
        list.set(2, 15);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
    }
}