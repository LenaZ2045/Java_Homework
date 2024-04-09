package com.telran.prof.lesson_9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestExampleSix {

    public static void main(String[] args) {
        // add, remove, contains - O(1)
        String inputData = "hjladhjjhd adhjjhdf adfdadfauie zzcnv..mzbc uotyurpiuerq";
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);
        }

        System.out.println("count of letter " + characters.size());
        System.out.println("letter : " + characters);
    }
}
