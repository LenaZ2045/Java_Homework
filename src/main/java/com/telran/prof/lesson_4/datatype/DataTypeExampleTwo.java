package com.telran.prof.lesson_4.datatype;

import java.util.Arrays;

public class DataTypeExampleTwo {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array before " + Arrays.toString(array));
        changeArray(array);
        System.out.println("Array after " + Arrays.toString(array));

    }

    private static void changeArray(int[] array) {
        int temp = array[1];
        System.out.println("Element with index 1 in method = " + array[1]);
        array[1] = 7;
        System.out.println("Array after change in method " + Arrays.toString(array));

    }
}
