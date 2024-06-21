package com.telran.prof.lesson_29.app;

public class DoneSumTotal {

    private final int[] array;

    public DoneSumTotal(int[] array) {

        this.array = array;
    }

    public void sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum form done sum total " + sum);
    }
}
