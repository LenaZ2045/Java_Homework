package com.telran.prof.lesson_29;

import java.util.concurrent.*;

public class BuildingAppFour {

    public static void main(String[] args) {
        String[] stages = {"1. Project", "2. Start", "3. Finish", "4. Approve"};

        CountDownLatch countDownLatchOne = new CountDownLatch(stages.length);
        CountDownLatch countDownLatchTwo = new CountDownLatch(stages.length);
        CountDownLatch countDownLatchThree = new CountDownLatch(stages.length);
        CountDownLatch countDownLatchFour = new CountDownLatch(stages.length);

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3); // may schedule fixed amount of threads

        System.out.println("Start thread");

        executorService.schedule(new Building("Dusseldorf", countDownLatchOne, stages), 3, TimeUnit.SECONDS);// and add to each thread time to wait by seconds
        executorService.schedule(new Building("Cologne", countDownLatchTwo, stages), 10, TimeUnit.SECONDS);
        executorService.schedule(new Building("Dortmund", countDownLatchThree, stages), 15, TimeUnit.SECONDS);
        executorService.schedule(new Building("Essen", countDownLatchFour, stages), 20, TimeUnit.SECONDS);

        try {
            countDownLatchOne.await();
            countDownLatchTwo.await();
            countDownLatchThree.await();
            countDownLatchFour.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Threads finished");
    }
}