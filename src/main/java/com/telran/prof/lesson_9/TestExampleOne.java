package com.telran.prof.lesson_9;

import java.util.Set;
import java.util.TreeSet;

public class TestExampleOne {

    public static void main(String[] args) {
        String inputData = "hjladhjjhd adhjjhdf adfdadfauie zzcnv..mzbc uotyurpiuerq";
        Set<Character> characters = new TreeSet<>();
        for (int i = 0; i < inputData.length(); i++) {
            char temp = inputData.charAt(i);
            characters.add(temp);
        }

        System.out.println("count of letter " + characters.size());
        System.out.println("letter : " + characters);

        char[] chars = inputData.toCharArray(); //difference in space complexity
    }
}
