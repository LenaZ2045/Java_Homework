package com.telran.prof.lesson_24;

import java.util.Random;

public class MthExampleSix {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            new Thread(new ExampleSix(random.nextInt(10))).start();
        }
    }
}