package com.telran.prof.lesson_27.exampleapp;

import java.util.List;

public class UnloadStorage extends Thread{

    private Storage storage;

    public UnloadStorage(Storage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true){
            synchronized (storage) {
                if (storage.getBoxes().size() > 0 && StorageApp.currentInteger.get() < storage.getBoxes().size()) {
                    List<Box> boxes = storage.getBoxes();
                    Box box = boxes.get(0);
                    boxes.remove(0);
                    System.out.println(" I am " + name + " got box by index" + box);
                } else {
                    try{
                        System.out.println(" i am " + name + " go to wait");
                        storage.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            sleepNow(200);
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
