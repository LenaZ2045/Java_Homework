package com.telran.prof.lesson_5;

public class TestArrayTwo {

    public static void main(String[] args) {
        int[][] array = new int[3][];
        int[][] arrayTwo = {{5,6,7},{8,9,10},{11,12,13},{22,33,44,55}};
        printArray(array);
        printArray(arrayTwo);
        int[][] arrayThree = {{5,6,7,8}, {1,2},{4,5,6,7,8,9,9}};
        System.out.println();
        printArray(arrayThree);
        int[][] arraySix = {{0,0,0,0}, null, {1,1,1,1}};
        System.out.println();
        printArray(arraySix);
    }

    private static void printArray(int[][] arrayTwo){
        for ( int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i] != null) {
                for (int j = 0; j < arrayTwo[i].length; j++) {
                    System.out.print(arrayTwo[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

    private static void printArrayTwo (int[][] arrayTwo){
        for (int[] ints : arrayTwo) {
            if (ints != null) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }

        }
    }
}