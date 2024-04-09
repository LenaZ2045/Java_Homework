package com.telran.prof.homework_7_March_4_24;

public class CustomIteratorApp {

    public static void main(String[] args) {
        int[] numbers = {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        CustomIterator customIterator = new CustomIterator(numbers);

        while (customIterator.hasNext()) {
            int value = customIterator.next();
            System.out.println("Next value : " + value);
        }
    }
}