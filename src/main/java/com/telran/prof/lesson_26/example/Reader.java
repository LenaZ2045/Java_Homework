package com.telran.prof.lesson_26.example;

import java.util.List;

public class Reader extends Thread {

    private final List<String> strings;

    public Reader(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (strings) {
            for (String str : strings) {
                System.out.println("Thread " + name + " read value " + str);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}