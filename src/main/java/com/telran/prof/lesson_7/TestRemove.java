package com.telran.prof.lesson_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestRemove {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Elements : " + list);


//        for (Integer element : list) { // concurrent exception error
//            if (element % 2 != 0) {
//                list.remove(element);
//            }
//        }


//        for (int i = 0; i < 10; i++) { // index out of bounds exception error
//            if (list.get(i) % 2 != 0) {
//                list.remove(i);
//            }
//        }


//        for (int i = 0; i < list.size(); i++) { // correct cycle to go over the list
//            if (list.get(i) % 2 != 0) {
//                list.remove(i);
//            }
//        }
//        System.out.println(list);


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            System.out.print(" " + current);
            if (current % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(list);
    }
}