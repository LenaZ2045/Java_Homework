package com.telran.prof.lesson_27;

import java.util.ArrayList;
import java.util.List;

public class ExampleThread {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        new Thread(new Consumer(stringList)).start();
        new Thread(new Producer(stringList)).start();

    }
}
