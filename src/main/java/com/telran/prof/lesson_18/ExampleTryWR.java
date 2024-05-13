package com.telran.prof.lesson_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleTryWR {

    public static void main(String[] args) {
        String path = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_18\\Football.txt";
        // creating some with or without TRY
//        FileInputStream fileInputStream = new FileInputStream(path);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}