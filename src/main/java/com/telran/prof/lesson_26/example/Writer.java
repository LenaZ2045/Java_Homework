package com.telran.prof.lesson_26.example;

import java.util.List;

public class Writer extends Thread {

    private final List<String> strings;

    public Writer(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (strings) {
            for (int i = 0; i < 5; i++) {
                strings.add("_" + i);
                System.out.println("Thread " + name + " add value " + strings);
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}