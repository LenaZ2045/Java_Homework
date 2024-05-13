package com.telran.prof.lesson_20;

import java.util.regex.Pattern;

public class ExampleRegex {

    public static void main(String[] args) {
        String regex = ".*www.*";
        String actual = "www.telran.de";
        // #1
        Pattern pattern = Pattern.compile(regex);
        boolean matches = pattern.matcher(actual).matches();
        System.out.println("Actual string contains REGEX("+regex+") = " + matches);
        // #2
        boolean matches1 = Pattern.matches(regex, actual); // contains any format we have
        System.out.println("Actual contains = " + matches1);

    }
}