package com.telran.prof.lesson_5;

import java.util.Arrays;

public class TestArrayThree {

    public static void main(String[] args) {
        int[][] array = {{1,2},{7,4},{8,5,4,9},{1}};
        int i = array[0][1]; // 2
        System.out.println(i); // prints 2
        int i1 = array[1][0]; // 7
        System.out.println(i1); // prints 7

        int[][][] arr = new int [2][2][2];
        System.out.println(Arrays.deepToString(arr)); // prints [[[0,0], [0,0]], [[0,0], [0,0]]]
        arr[0][0][0] = 1; // [[[1,0], [0,0]], [[0,0], [0,0]]]
        System.out.println(Arrays.deepToString(arr));// prints [[[1,0], [0,0]], [[0,0], [0,0]]]
        int[][][] arrayTwo = {{{1,2},{7,4},{8,5,4,9},{1}}, {{12,22},{77,40},{18,15,44,19},{11}}};
        System.out.println(Arrays.deepToString(arrayTwo[0])); // [[1, 2], [7, 4], [8, 5, 4, 9], [1]]
        System.out.println(Arrays.deepToString(arrayTwo[1])); // [[12, 22], [77, 40], [18, 15, 44, 19], [11]]

        System.out.println(Arrays.toString(arrayTwo[0][0])); // [1, 2]
        System.out.println(arrayTwo[0][0][1]); // 2

        System.out.println(Arrays.deepToString(arrayTwo)); // [[[1, 2], [7, 4], [8, 5, 4, 9], [1]], [[12, 22], [77, 40], [18, 15, 44, 19], [11]]]
    }
}