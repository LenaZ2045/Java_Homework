package com.telran.prof.lesson_19;

public class ExampleEight {

    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 0};
            System.out.println(arr[4] / arr[3]);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception instanceof ArithmeticException ? "Incorrect operation with division" : "Incorrect index of array");
        }
    }
}