package com.telran.prof.lesson_25.monitoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
//        Set<>

        Thread thread = new Thread(new Monitoring(strings));
        thread.setDaemon(true); // ends within the thread "exit"
        thread.start();

        String data = null;
        while(!"exit".equals(data)) {
            System.out.println("Input city ");
            data = scanner.next();
            strings.add(data);
        }
    }
}
