package com.telran.prof.lesson_28.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(5, true); // we limit here open tables and also with "TRUE" we state to have an order
        boolean[] freeTables = new boolean[5];

        String[] names = {"Roman", "Alena", "Anna", "Kira", "Leo", "Bob", "Jack", "Inna"};

        for (String name : names) {
            new Thread(new Person(name, semaphore, freeTables)).start();
            Thread.sleep(700);
        }
        // Home - gas station, 3 stations,
        }
    }