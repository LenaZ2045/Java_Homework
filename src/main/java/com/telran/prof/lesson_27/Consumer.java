package com.telran.prof.lesson_27;

import java.util.List;

public class Consumer extends Thread{

    private List<String> strings;

    public Consumer(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        while (true) {
//            sleepNow(100);
            synchronized (strings) {
                if (strings.size() > 0) {
                    String s = strings.get(0);
                    System.out.println("Object from list " + s);
                    strings.remove(0);
                    System.out.println("Size of list " + strings.size());
                } else {
                    try {
                        strings.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println("Check list. List is empty!");
                }
            }
        }
    }

    private void sleepNow(long ms) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
