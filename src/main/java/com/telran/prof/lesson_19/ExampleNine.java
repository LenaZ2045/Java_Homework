package com.telran.prof.lesson_19;

public class ExampleNine {

    public static void main(String[] args) {
        check(0);
        check(10);
        System.out.println();
    }

    private static void check(int n) {
        try {
            int x = 10 / n;
            int[] y = new int[n];
            y[n] = 10;
        } catch (ArithmeticException | IndexOutOfBoundsException exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println("Can't divide by zero");
            }
            if (exception instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Index does not exists");
            }
        }

        // "Can't divide by zero", "Index does not exists"
        // use one catch for it
        // catch two exception "Can not divide by zero" "Index does not exist"
        // use one catch block for it
    }
}