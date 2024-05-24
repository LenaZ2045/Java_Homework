package com.telran.prof.lesson_24.arrayexample;

import java.util.Arrays;
import java.util.Random;

public class SumArrayApp {

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[10000];
        Random random = new Random();
        for (int i = 0; i < 10000;i++) {
            array[i] = random.nextInt(200);
        }
        System.out.println(Arrays.toString(array));

        Counter counter = new Counter();
        long startTime = System.currentTimeMillis();
        counter.countSum(array);
        System.out.println("It takes in one thread " + (System.currentTimeMillis() - startTime));

        int[] result = new int[4];
        MthCounter one = new MthCounter(array, 0, 2500, 0, result);
        MthCounter two = new MthCounter(array, 2500, 5000, 1, result);
        MthCounter three = new MthCounter(array, 5000, 7500, 2, result);
        MthCounter four = new MthCounter(array, 7500, 10000, 3, result);

        long timeStart = System.currentTimeMillis();
        Thread oneT = new Thread(one);
        oneT.start();
        Thread twoT = new Thread(two);
        twoT.start();
        Thread threeT = new Thread(three);
        threeT.start();
        Thread fourT = new Thread(four);
        fourT.start();

        oneT.join();
        twoT.join();
        threeT.join();
        fourT.join();

        System.out.println("It takes time in 4 threads " + (System.currentTimeMillis() - timeStart));

        int resultSum = 0;
        for (int el : result)
            resultSum += el;
        System.out.println("Result sum of array is " + resultSum);
    }
}
