package com.telran.prof.lesson_17;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class ChangeOutExample {

    public static void main(String[] args) throws Exception { // not correct to use Exception in the method for whole code
        String path = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\files";

        OutputStream fileOutputStream = new FileOutputStream(path);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);
        System.out.println("Hello!");
        System.out.println("Class!");
    }
}