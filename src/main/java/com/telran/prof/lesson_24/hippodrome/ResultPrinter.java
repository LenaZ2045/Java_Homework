package com.telran.prof.lesson_24.hippodrome;

import java.util.List;

public class ResultPrinter implements Runnable {

    private List<Horse> result;

    private int place;

    public ResultPrinter(List<Horse> result) {
        this.result = result;
    } // constructor

    @Override
    public void run() {
        boolean isDone = false;
        while (!isDone) {
            isDone = true;
            for (Horse resultString : result) {
                if (resultString == null) {
                    isDone = false;
                }
            }
        }
        System.out.println();
        for (Horse res : result) {
            place++;
            System.out.println(place + " place took = " + res);
        }
    }
}