package com.telran.prof.lesson_29;

import java.util.concurrent.Callable;

public class CallableExample implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        return "Hello";
    }
}
