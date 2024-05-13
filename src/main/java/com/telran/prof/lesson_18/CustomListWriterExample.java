package com.telran.prof.lesson_18;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;

public class CustomListWriterExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "I", "learn", "Java-Pro");
        String path = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_18\\CustomListWrite.txt";

        Writer customListWriter = new CustomListWriter(path);
        strings.stream().forEach(s -> {
            try {
                customListWriter.write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}