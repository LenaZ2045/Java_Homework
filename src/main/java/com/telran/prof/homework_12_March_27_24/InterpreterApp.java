package com.telran.prof.homework_12_March_27_24;

import java.util.*;

public class InterpreterApp {

    public static void main(String[] args) {
        Map<String, String> words = new HashMap<>();
        words.put("apple", "яблоко");
        words.put("berry", "ягода");
        words.put("cider", "сидр");
        words.put("doll", "кукла");
        words.put("enter", "входить");
        words.put("fruit", "фрукт");
        words.put("genial", "гениальный");

        System.out.println("    MAP = HASH MAP");
        DictionaryMap dictionaryMap = new DictionaryMap(words);
        dictionaryMap.inputWordMap();
        System.out.println();
        dictionaryMap.printDictionaryMap();

        System.out.println();
        List<Interpreter> wordList = new ArrayList<>();
        wordList.add(new Interpreter("apple", "яблоко"));
        wordList.add(new Interpreter("berry", "ягода"));
        wordList.add(new Interpreter("cider", "сидр"));
        wordList.add(new Interpreter("doll", "кукла"));
        wordList.add(new Interpreter("enter", "входить"));
        wordList.add(new Interpreter("fruit", "фрукт"));
        wordList.add(new Interpreter("genial", "гениальный"));

        System.out.println("    LIST = ARRAY LIST");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the word you wish to translate: ");
        String userInput = scanner.next();

        String translation = null;
        for (Interpreter word : wordList) {
            if (word.getEnglishWord().equalsIgnoreCase(userInput)) {
                translation = word.getTranslation();
                break;
            }
        }

        if (translation != null) {
            System.out.println("Translation of \"" + userInput + "\": " + translation);
        } else {
            System.out.println("Word not found in the dictionary.");
            System.out.println("Enter the meaning for word " + userInput);
            translation = scanner.next();
            wordList.add(new Interpreter(userInput, translation));
        }

        System.out.println("Dictionary List: " + wordList);
    }
}