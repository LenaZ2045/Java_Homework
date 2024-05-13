package com.telran.prof.lesson_19;

import java.util.Scanner;

public class TestExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease input your age : ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        // Throwable - is a parent class for all exceptions

        // Checked - type of exception that need to handle out code
        // (try-check or throws) - is a must to handle our code

        // Unchecked - this type may not be handled or may handle our code
        // if our Exception extends from RuntimeException

        // Throwable is a parent class
        // Error is a child         and         Exception is a child class
        //                                          (checked, unchecked)
    }
}