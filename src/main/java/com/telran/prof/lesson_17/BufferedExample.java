package com.telran.prof.lesson_17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedExample {

    public static void main(String[] args) {
        String pathToFle = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\file.txt";
        try {
        InputStream fileInputStream = new FileInputStream(pathToFle);


            Scanner scanner = new Scanner(fileInputStream);
//            System.out.println(scanner.next()); // class InputStream
            while (scanner.hasNext()) {

                System.out.println(scanner.nextLine());
            }
            scanner.close();
            fileInputStream.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            System.out.println(s);
        }catch (Exception exception) {

        }
    }
}