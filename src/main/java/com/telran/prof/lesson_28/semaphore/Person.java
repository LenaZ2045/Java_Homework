package com.telran.prof.lesson_28.semaphore;

import java.util.concurrent.Semaphore;

public class Person implements Runnable{

    private final String name;

    private Semaphore semaphore;

    private final boolean[] freeTable;

    public Person(String name, Semaphore semaphore, boolean[] freeTable) {
        this.name = name;
        this.semaphore = semaphore;
        this.freeTable = freeTable;
    }

    @Override
    public void run() {
        System.out.println("-> " + name + " arrived at the restaurant registry");
        int tableNumber = -1;

        try {
            // decreases by 1 , 4 3 2 1 0
        semaphore.acquire(); // code goes to the pause or sleeps (loaned element)
            // semaphore.acquire(3); - only 3 tables will be occupied at once
        synchronized (freeTable) {
            for (int i = 0; i < 5; i++) {
                // !(freeTable[i] = false) == true
                if (!freeTable[i]) { // or freeTable[i] == false
                    freeTable[i] = true;
                    tableNumber = i;
                    System.out.println("[!] " + name + " occupied table # " + (i + 1));
                    break;
                }
            }
        }

            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (freeTable) {
            freeTable[tableNumber] = false;
        }
        // increases by 1 2 3
        semaphore.release(); // released an element
        // semaphore.release(5);
        synchronized (freeTable) {
            System.out.println("<- " + name + " finished and left");
            System.out.println("[!] table # " + (tableNumber + 1) + " is free");
        }
    }
    }