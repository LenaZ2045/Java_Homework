package com.telran.prof.lesson_29;

import java.util.concurrent.*;

public class CallableApp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableExample callableExample = new CallableExample(); // returns some value
        // submit - Callable, Runnable
        Future<String> submit = executorService.submit(callableExample); // calling for the method and ask ing for a value

        System.out.println("Try to get result ->");
        try {
            System.out.println(submit.get(5, TimeUnit.SECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("No results were found within 5 seconds");
        }
        System.out.println("End of get result");
        executorService.shutdown();
    }
}
