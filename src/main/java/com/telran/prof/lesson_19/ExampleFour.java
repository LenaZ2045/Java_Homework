package com.telran.prof.lesson_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleFour {

    public static void main(String[] args) {
        String path = "text.txt";
        String infoFromFile = getInfoFromFile(path);
        System.out.println(infoFromFile);
    }

    private static String getInfoFromFile(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader reader = new BufferedReader(fileReader);
            return reader.readLine();
        } catch (IOException exception) {
            System.out.println("Error with file path");
            return null;
        }
    }
}