package com.telran.prof.lesson_23;

public class ArrayService {

    public int findMax(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IncorrectInputArrayException("Array initializing Error");
        }
        int max = Integer.MIN_VALUE;
//        int max = arr[0]; // line above performs same

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
//            if(max <arr[i]) { // line above code is the same
//                max = arr[i];
//            }
        }
        return max;
    }

    public int findMin(int[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IncorrectInputArrayException("Array initializing Error");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}