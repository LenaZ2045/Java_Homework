package com.telran.prof.lesson_27.exampleapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Truck extends Thread {


    private Storage storage;

    public Truck(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            sleepNow(5000);
            int size = random.nextInt(50);
            List<Box> boxList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                boxList.add(new Box(random.nextInt()));
            }
            synchronized (storage) {
                storage.setBoxes(boxList);
                System.out.println("\nload to storage " + boxList.size() + " boxes\n");
                sleepNow(2000);
                storage.notifyAll();
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