package com.telran.prof.lesson_9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class TestExampleEight {

    public static void main(String[] args) {
        String hello = "Hello world in Java!!!";
        char[] chars = hello.toCharArray();
        Set<Character> characters = getCharactersOne(chars);
        System.out.println(characters);
    }

    private static Set<Character> getCharactersOne(char[] chars) {
        Set<Character> characters = new HashSet<>();
        for (char value : chars) {
            characters.add(value);
        }
        return characters;
    }

    private static Set<Character> getCharactersTwo(Character[] chars) {
        Set<Character> characters = new HashSet<>(Arrays.asList(chars));
        return characters;
    }

    private static Set<Character> getCharactersThree(Character[] chars) {
        Set<Character> characters = new HashSet<>();
        Collections.addAll(characters,chars);
        return characters;
    }

    private static Set<Character> getCharactersFour(Character[] chars) {
        return Arrays.stream(chars).collect(Collectors.toSet());
    }

    private static Set<Character> getCharactersFive(Character[] chars) {
        return new HashSet<>(Set.of(chars));
    }
}