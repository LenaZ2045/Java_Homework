package com.telran.prof.lesson_19;

public class ExampleThree {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;

            System.out.println(x / y);
        } catch (ArithmeticException exception) {
            System.out.println("Error when dividing by zero");
        }

        try {
            div(15, 0);
        } catch (ArithmeticException exception) {
            System.out.println("Error during division"); // this is unchecked exception
        }
    }

    private static void div(int x, int y) throws ArithmeticException {
        System.out.println(x / y);
    }
}