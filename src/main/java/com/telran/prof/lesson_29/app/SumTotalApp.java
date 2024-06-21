package com.telran.prof.lesson_29.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumTotalApp {

    public static void main(String[] args) {
        int[] ints = new int[10000];
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            ints[i] = random.nextInt(100);
        }
        long start = System.currentTimeMillis();
        System.out.println("Start count : ");
        new DoneSumTotal(ints).sum();
        System.out.println("End count " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        System.out.println("STart in pool count ");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Future<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i <= 30000; i = i + 1000) {
            resultList.add(executorService.submit(new SumTotal(ints, i, i + 10000)));
        }

        int sumList = 0;
        for (Future<Integer> result : resultList) {
            // finish the code with the List example
        }

        Future<Integer> submitOne = executorService.submit(new SumTotal(ints, 0, 2500));
        Future<Integer> submitTwo = executorService.submit(new SumTotal(ints, 10000, 20000));
        Future<Integer> submitThree = executorService.submit(new SumTotal(ints, 20000, 30000));
        Future<Integer> submitFour = executorService.submit(new SumTotal(ints, 30000, 40000));

        int sum = 0;
        try {
            sum = submitOne.get() + submitTwo.get() + submitThree.get() + submitFour.get();
            System.out.println("End in pool count " + (System.currentTimeMillis() - start));
            System.out.println("Result form roll " + sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("Problem with " + e.getMessage());        }
                executorService.shutdown();
    }
}
