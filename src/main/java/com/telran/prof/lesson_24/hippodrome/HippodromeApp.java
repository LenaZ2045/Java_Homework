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
        List<Thread> threadList = new ArrayList<>();


        for (Horse horse : horses) {
            threadList.add(new Thread(horse));
        }

        // threadList.forEach(thread -> thread.start()); // option to write it differently (lombok)
        threadList.forEach(Thread::start); // option to write line above as method reference
        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Collections.sort(horses);
        ResultPrinter printer = new ResultPrinter(horses);
        new Thread(printer).start();
    }
}