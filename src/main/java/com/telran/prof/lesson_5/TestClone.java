package com.telran.prof.lesson_5;

import java.util.Arrays;

public class TestClone {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        int[] array2 = array1;
        array2[1] =7;
        System.out.println(Arrays.toString(array1));

        int[] cloneArray = array1.clone();
        System.out.println("Cloned Array " + Arrays.toString(cloneArray));
        System.out.println("Is equals = " + (array1 == cloneArray));

        // clone for Double-Sized array
        int[][] array3 = {{10,20,30},{40,50}};
        int[][] cloneArrayTwo = array3.clone();
        System.out.println("Is equals Double-Sized = " + (array3 == cloneArrayTwo));
        System.out.println("Is equals = " + (array3[0] == cloneArrayTwo[0]));
        System.out.println("Is equals = " + (array3[1] == cloneArrayTwo[1]));


    }
}
