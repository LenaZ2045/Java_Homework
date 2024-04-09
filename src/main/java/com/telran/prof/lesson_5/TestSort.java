package com.telran.prof.lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,23,2,8,3,1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("D");
        list.add("C");
        list.add("A");
        Collections.sort(list);
        System.out.println(list);

//        Arrays.binarySearch();
    }
}