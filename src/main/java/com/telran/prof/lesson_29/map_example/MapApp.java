package com.telran.prof.lesson_29.map_example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MapApp {

    public static void main(String[] args) {
        Map<String, Integer> cm = new ConcurrentHashMap<>();// used two collections which works with multi-threads di
        Map<String, Integer> hm = new HashMap<>(); // not synchronized
        Map<String, Integer> sm = Collections.synchronizedMap(hm); // distribution for code is slower for all this threads

        CountDownLatch countDownLatch1 = new CountDownLatch(5);
        CountDownLatch countDownLatch2 = new CountDownLatch(5);
        CountDownLatch countDownLatch3 = new CountDownLatch(5);


        checkTime(cm, countDownLatch1, "cm");
        checkTime(sm, countDownLatch2, "sm");
        checkTime(hm, countDownLatch3, "hm");

    }

    private static void checkTime(Map<String, Integer> map, CountDownLatch cd, String name) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Random random = new Random();
        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                map.put(String.valueOf(i), random.nextInt(100)); // synchronized methods
                map.get(String.valueOf(i)); // synchronized methods
            }
            cd.countDown();
        };
        long start = System.currentTimeMillis();
        for ( int i = 0; i < 5; i++) {
            executorService.execute(runnable);
        }
        try {
            cd.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("Full time = " + (System.currentTimeMillis() - start));
    }
}