package com.telran.prof.lesson_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFive {

    public static void main(String[] args) {
        String path = "text.txt";
        try {
        readFile(path); // it marks in this execution that we need to surround it with (try-catch)
        } catch (IOException exception) {
            System.out.println("Error with file path");
        }
    }
    private  static  void readFile(String path) throws  IOException{ // exception in the method signature
        getInfoFromFile(path);
    }
    private static String getInfoFromFile(String path) throws IOException{ // exception in the method signature
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            return reader.readLine();

    }
}
