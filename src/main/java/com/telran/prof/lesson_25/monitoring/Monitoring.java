package com.telran.prof.lesson_25.monitoring;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Monitoring implements Runnable{

    private List<String> stringList;

    public Monitoring(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public void run() {
        String path = "src/main/java/com/telran/prof/lesson_25/exampleapp/text.txt";

        FileWriter writer = null;
        try {
            writer = new FileWriter(path);
        } catch (IOException e) {
            System.out.println("Incorrect path " + path);
            return;
        }
        while (true) {
            sleep();
            StringBuilder sb = new StringBuilder();
            sb.append(LocalDateTime.now());
            sb.append(" - ").append("count of cities ").append(stringList.size()).append("\n");
            try {
                writer.write(sb.toString());
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void  sleep() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
