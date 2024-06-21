package com.telran.prof.lesson_27;

import java.time.LocalTime;
import java.util.List;

public class Producer extends Thread{

    private List<String> stringList;

    public Producer(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public void run() {
        while (true) {
            sleepNow(2000);
            synchronized (stringList) {
                stringList.add("Hello World " + LocalTime.now());
                stringList.notify();
            }
        }
    }

    private void sleepNow(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
