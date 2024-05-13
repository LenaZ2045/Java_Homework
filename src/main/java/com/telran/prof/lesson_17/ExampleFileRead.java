package com.telran.prof.lesson_17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleFileRead {

    public static void main(String[] args) {

        // try {
        // we might have a problem here
        // } catch (exception e) {
        // handle exception
        // }

        String pathToFle = "C:/Users/bogyp/Downloads/demo/Java_Pro-301023/src/main/java/com/telran/prof/lesson_17/file.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFle);
            int read = fileInputStream.read();
            System.out.println(read);
        } catch (IOException exception) {
            System.out.println("Incorrect file path. Check your address path");
        }

        try {
            FileInputStream fileInputStream1 = new FileInputStream(pathToFle);
            while (fileInputStream1.available() > 0) {
                int read = fileInputStream1.read();
                System.out.println(" " + (char) read);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Incorrect file path. Check your address path");
        } catch (IOException exception) {
            System.out.println("File access error. Try again");
        }
        System.out.println("The End of application");
    }
}