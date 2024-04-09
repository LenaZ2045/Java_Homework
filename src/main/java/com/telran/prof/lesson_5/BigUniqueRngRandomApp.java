package com.telran.prof.lesson_5;

public class RandomApp {
    public static void main(String[] args) {

        BigUniqueRng bigRng = new BigUniqueRng(5, 20);
        while (bigRng.hasNext()) {
            System.out.print(bigRng.next() + " ");
        }
    }
}