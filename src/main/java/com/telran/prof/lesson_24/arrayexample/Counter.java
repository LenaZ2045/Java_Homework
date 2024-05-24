package com.telran.prof.lesson_24.arrayexample;

public class Counter {

    public void countSum(int[] array) {
        int sum = 0;
        for(int element : array) {
            sum += element;
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
    }
}
