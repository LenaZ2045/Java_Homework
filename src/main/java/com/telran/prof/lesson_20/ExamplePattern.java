package com.telran.prof.lesson_20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamplePattern {
    public static void main(String[] args) {
        String actual = "I learn about Telran College and now I'm studying Java";
        String regex = "i";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE); // upper and lower cases
        Matcher matcher = pattern.matcher(actual);
        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
        }

    }
}
