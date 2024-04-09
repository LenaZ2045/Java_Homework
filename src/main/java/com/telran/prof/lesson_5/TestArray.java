package com.telran.prof.lesson_5;

import java.util.Random;

public class TestArray {

    private static final int LENGTH_OF_ARRAY = 5;

    public static void main(String[] args) {
        int[] array = new int[5]; // can initialize as = new int{LENGTH_OF_ARRAY]
        int[] arrayTwo = new int[] {2, 3, 4, 5, 6, 7};
        int[] arrayThree = {3, 4, 5, 6, 7, 8, 9};

        Random random = new Random();
        for (int i = 0; i < LENGTH_OF_ARRAY; i++) {
            //return the array with 5 random values 0-to-10
            array[i] = random.nextInt(51);
        }

        for (int value : array) { // to print our created array with random numbers
            System.out.print(value + " ");
        }

        System.out.println();
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.println("Element by Index = " + arrayThree[i]);
        }

        System.out.println();
        for (int element : arrayTwo) {
            System.out.println("Element by Index = " + element);
        }
    }
    @Override
    public String toString() {
        return "TestArray{}";
    }
}