package com.telran.prof.homework_12_March_27_24;

import java.util.Map;
import java.util.Scanner;

public class DictionaryMap {
    private Scanner scanner;

    public Map<String, String> dictionary;

    public DictionaryMap(Map<String, String> list) {
        this.dictionary = list;
        this.scanner = new Scanner(System.in);
    }

    public String inputWordMap() {
        System.out.println("Please enter a word");
        String userInput = scanner.next();
        String translation = String.valueOf(dictionary.get(userInput));
        if (dictionary.containsKey(userInput)) {
            System.out.println("Translation = '" + userInput + "' : " + translation);
        } else {
            System.out.println("Word not found");
            System.out.println("Please enter the translation for '" + userInput + "' : ");
            translation = scanner.next();
            dictionary.put(userInput, translation);
            System.out.println("Added new translation for '" + userInput + "' : " + translation);
        }
        return userInput;
    }

    public void printDictionaryMap() {
        System.out.println("Dictionary contains:");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}