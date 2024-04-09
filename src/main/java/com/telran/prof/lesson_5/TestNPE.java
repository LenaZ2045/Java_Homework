package com.telran.prof.lesson_5;

public class TestNPE {

    public static void main(String[] args) {
        String hello = "Hello";
        checkString(hello);

//        checkString(null); // calling object which is not available will give us NullPointerException
        checkStringTwo(null);
    }

    private static void checkString(String str) {
        if(str.equals("Hello")) {
            System.out.println("Hello! Hello!");
        }
    }

    private static void checkStringTwo(String str) {
        if("Hello".equals(str)) {
            System.out.println("Hello! Hello!");
        }
    }
}
