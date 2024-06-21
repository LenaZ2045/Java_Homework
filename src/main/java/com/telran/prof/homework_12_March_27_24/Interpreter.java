package com.telran.prof.homework_12_March_27_24;

public class Interpreter {
    private String englishWord;

    private String translation;

    public Interpreter(String englishWord, String translation) {
        this.englishWord = englishWord;
        this.translation = translation;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Interpreter{" + "word='" + englishWord + '\'' + ", means='" + translation + '\'' + '}';
    }
}