package com.telran.prof.lesson_18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestRW {

    public static void main(String[] args) {
        // Reader, Writer similar to Input and Output Streams but it works with characters

        String pathIn = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_18\\Football.txt";
        String pathOut = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_18\\OutFootball.txt";

        try (FileReader fileReader = new FileReader(pathIn);FileWriter writer = new FileWriter(pathOut);){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.ready()) { // each line reading by full-lines
                String data = bufferedReader.readLine(); // use it where we have full lines/strings that end/start with new line
                writer.write(data + "\n");
            }
//            while (fileReader.ready()) { // character reading and writing by byte
//                int data = fileReader.read();
//                writer.write(data);
//            }
        }catch (IOException e) {
            System.out.println("We have a problem " + e.getMessage());
        }
    }
}