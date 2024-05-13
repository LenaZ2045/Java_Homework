package com.telran.prof.lesson_20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleMatcher {

    public static void main(String[] args) {
        String regex = "tel"; // contains email? as variable regex
        String actual = "www.telran.de.tel.com"; // find email from text

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actual);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end() - 1;
            System.out.println("Pattern found from " + start + " to " + end);
        }
    }
}