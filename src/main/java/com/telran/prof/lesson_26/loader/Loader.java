package com.telran.prof.lesson_26.loader;

import java.util.List;

public class Loader implements Runnable{

    final List<String> list;

    public Loader(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (list) {
            while (true) {
                sleep(1000);
                for (int i = 0; i < 10; i++) {
                    list.add("_" + i);
                    System.out.println("Thread " + name + "add value" + "-" + i);
                }
            }
        }
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}