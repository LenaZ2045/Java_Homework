package com.telran.prof.lesson_26.loader;

import java.util.LinkedList;
import java.util.List;

public class LoadUnloadApp {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        new Thread(new Loader(list)).start();
        new Thread(new Unloader(list)).start();
    }
}