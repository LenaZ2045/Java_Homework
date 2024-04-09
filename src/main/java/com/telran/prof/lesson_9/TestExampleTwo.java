package com.telran.prof.lesson_9;

import java.util.Set;
import java.util.TreeSet;

public class TestExampleTwo {

    public static void main(String[] args) {
        String inputData = "hjladhjjhd adhjjhdf adfdadfauie zzcnv..mzbc uotyurpiuerq";
        // pick only unique characters-elements
        char[] charArray = inputData.toCharArray();
        Set<Character> characters = new TreeSet<>();
        Set<Character> characterDuplicatedSet = new TreeSet<>();

        for (char temp : charArray) {
            boolean resultOfAdd = characters.add(temp);
            if (!resultOfAdd) {
                characterDuplicatedSet.add(temp);
            }
//            if (characters.contains(temp)) {
//                characterDuplicatedSet.add(temp);
//            } else {
//                characters.add(temp);
//            }
        }

        System.out.println("Original data : " + inputData);
        System.out.println("all elements unique " + characters);
        System.out.println("elements with 2 or more times repeating " + characterDuplicatedSet);
        for (char value : characters) { // sample of iteration for each
            if (!characterDuplicatedSet.contains(value)) {
                System.out.println("Unique elements : " + value);
            }
        }
    }
}
