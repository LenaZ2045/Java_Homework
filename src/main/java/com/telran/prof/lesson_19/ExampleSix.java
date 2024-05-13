package com.telran.prof.lesson_19;

public class ExampleSix {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            System.out.println(array[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("incorrect index");
        }
        System.out.println("Hello");
        try {
        System.out.println(array[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("incorrect index");
        }

        String s = null;

        try {
        System.out.println(s.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Cannot convert null value");
        }
    }
}
