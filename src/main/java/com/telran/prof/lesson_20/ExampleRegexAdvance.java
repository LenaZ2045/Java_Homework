package com.telran.prof.lesson_20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegexAdvance {

    public static void main(String[] args) {
        String actual = "I1learn2about3Telran4College5and6now6I'm7studying8Java";
        String regex = "\\d"; // any digit from 0 to 9
        Matcher matcher = Pattern.compile(regex).matcher(actual);
        while (matcher.find()) {
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end() - 1));
        }

        String[] strings = actual.split(regex);
        for (String current : strings) {
            System.out.print(current + "_");
        }

        Pattern pattern = Pattern.compile(regex);
        String[] strings1 = pattern.split(actual);
        for (String current : strings1) {
            System.out.print(current + " ");
        }
    }
}