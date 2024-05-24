package com.telran.prof.lesson_24.hippodrome;

import com.github.javafaker.Faker;

import java.util.*;

public class HippodromeApp {

    public static void main(String[] args) {
        Faker horseName = new Faker();
        int loopLength = 1000;
        Random random = new Random();
        List<Horse> horses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            horses.add(new Horse(horseName.name().firstName(), random.nextInt(10), loopLength));
        }
        for (Horse horse : horses) {
            new Thread(horse).start();
        }
//        Collections.sort(horses, horses.get(loopLength));
        System.out.println(horses);
    }
}