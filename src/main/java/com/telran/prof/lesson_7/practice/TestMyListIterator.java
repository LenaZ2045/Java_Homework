package com.telran.prof.lesson_7.practice;

import java.util.Iterator;

public class TestMyListIterator {

    public static void main(String[] args) {
        MyList list = new MyList(new String[] {"One", "Four", "Two", "Five", "Three", "Six", "Four"});

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}