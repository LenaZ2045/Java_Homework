package com.telran.prof.lesson_6.practice;

import java.util.ArrayList;
import java.util.List;

public class TestPatternThree {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("HELLO");
        stringList.add("I AM");
        stringList.add("WORLD");
        stringList.add("hi");
        stringList.add("HELLO");
        stringList.add("I");
        stringList.add("WORLD");
        stringList.add("help");

        TestPatternThree testPatternThree = new TestPatternThree();
        int stringsSumLength = testPatternThree.getStringsSumLength(stringList);
        System.out.println("Total sum is = " + stringsSumLength);

        int max = testPatternThree.getMaxStingLength(stringList);
        System.out.println("Max length of element " + max);
    }

    private int getStringsSumLength(List<String> list) {
        int sum = 0;
        for (String value : list) {
            sum += value.length();
        }
        return sum;
    }

    private int getMaxStingLength(List<String> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
//            int currentLength = list.get(i).length();
//            if(max < currentLength) {
//                max = currentLength;
//            }
            max = Math.max(max, list.get(i).length());
        }
        return max;
    }
}