package com.telran.prof.lesson_26.example;

import java.util.ArrayList;
import java.util.List;

public class WRApp {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Reader reader = new Reader(list);
        Writer writer = new Writer(list);

        reader.start();
        writer.start();
    }
}
