package com.telran.prof.lesson_20;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ExamplePhoneRegex {

    public static void main(String[] args) {
        // 7777777
        // 777-7777
        // 777 7777

        String regex = "\\d\\d\\d([-\\s])?\\d\\d\\d\\d";
        Pattern pattern = Pattern.compile(regex);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String data = scanner.nextLine();
            if ("exit".equals(data)) {
                break;
            }
            boolean result = pattern.matcher(data).matches();
            System.out.println("Data " + data + " matches regex " + result);
        }
    }
}