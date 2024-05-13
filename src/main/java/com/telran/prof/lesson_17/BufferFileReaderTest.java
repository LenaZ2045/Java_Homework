package com.telran.prof.lesson_17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferFileReaderTest {
    public static void main(String[] args) {
        String pathToFle = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\file.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(pathToFle);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream); //convert byte stream into characters stream
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            bufferedReader.lines().forEach(line -> System.out.println(line));
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        }catch (Exception exception) {
            System.out.println("Problem with file " + exception.getMessage());
        }
    }
}