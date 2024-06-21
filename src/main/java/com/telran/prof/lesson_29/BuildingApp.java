package com.telran.prof.lesson_29;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BuildingApp {

    public static void main(String[] args) {
        String[] stages = {"1. Project", "2. Start", "3. Finish", "4. Approve"};

        CountDownLatch countDownLatchOne = new CountDownLatch(stages.length);
        CountDownLatch countDownLatchTwo = new CountDownLatch(stages.length);
        CountDownLatch countDownLatchThree = new CountDownLatch(stages.length);
        CountDownLatch countDownLatchFour = new CountDownLatch(stages.length);

        ExecutorService executorService = Executors.newSingleThreadExecutor(); // single thread
        System.out.println("Start thread");

        executorService.execute(new Building("Dusseldorf", countDownLatchOne, stages));
        executorService.execute(new Building("Cologne", countDownLatchTwo, stages));
        executorService.execute(new Building("Dortmund", countDownLatchThree, stages));
        executorService.execute(new Building("Essen", countDownLatchFour, stages));

        try {
            countDownLatchOne.await();
            countDownLatchTwo.await();
            countDownLatchThree.await();
            countDownLatchFour.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Thread finished");
    }
}
