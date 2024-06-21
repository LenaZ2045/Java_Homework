package com.telran.prof.lesson_27.exampleapp;

import java.util.concurrent.atomic.AtomicInteger;

public class StorageApp {

    public static AtomicInteger currentInteger = new AtomicInteger();
    public static void main(String[] args) {
        Storage storage = new Storage();

        currentInteger.set(0);
        for (int i = 0; i < 10; i++) {
            new Thread(new UnloadStorage(storage)).start();
        }

        new Thread(new Truck(storage)).start();
    }
}