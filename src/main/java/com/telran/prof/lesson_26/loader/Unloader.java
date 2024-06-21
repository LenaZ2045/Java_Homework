package com.telran.prof.lesson_26.loader;

import java.util.Iterator;
import java.util.List;

public class Unloader implements Runnable {

    List<String> list;

    public Unloader(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            sleep(1000);
            synchronized (list) {
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    System.out.println("Unload " + iterator.next());
                    iterator.remove();
                    sleep(1000);
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
