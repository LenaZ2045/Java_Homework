package com.telran.prof.lesson_5;

public class TestCompare {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        if (a == b) {
            System.out.println("It is equals primitive data");
        } else {
            System.out.println("It is not equal primitive data");
        }
        // Class, array, String, Interface, Enum
        int[] arrayOne = {1, 2, 3};
        int[] arrayTwo = {1, 2, 3};
        if (arrayOne == arrayTwo) {
            System.out.println("It is equals arrays");
        } else {
            System.out.println("It is not equal arrays");
        }
// pull unequal by symbols strings
        String one = "Hello";
        String two = "Hello"; // releases from one same object Only for strings
        if (one == two) {
            System.out.println("It is equals strings"); // will be equal
        } else {
            System.out.println("It is not equal strings");
        }

        String three = new String("Hello");
        if (three == two) {
            System.out.println("It is equals strings");
        } else {
            System.out.println("It is not equal strings");// will not be equal
        }

        if(one.equals(three)) {
            System.out.println("It is equals strings"); // will be equal by EQUAL method
        }else {
            System.out.println("It is not equal strings");
        }

    }
}
