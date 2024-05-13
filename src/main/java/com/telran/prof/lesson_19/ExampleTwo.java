package com.telran.prof.lesson_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleTwo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader("test.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String s = reader.readLine();
        System.out.println(s);
    }
}