package com.telran.prof.lesson_17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ExampleFileWrite {

    public static void main(String[] args) {
        String pathToFle = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\file.txt";

        String text = "Hello from Java";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(pathToFle);
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
            for (byte temp : bytes) {
                fileOutputStream.write(temp);
            }
//            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Incorrect file path. Check your address path");
        } catch (IOException exception) {
            System.out.println("File access error. Try again");
        }

    }
}