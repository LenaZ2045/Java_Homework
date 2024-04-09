package com.telran.prof.lesson_10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestCompareOne {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5,7,3,2,6,4,2,1,8,9);
        System.out.println("List before sort " + integerList);
        Collections.sort(integerList);
        System.out.println("List after sort " + integerList);
    }
}
