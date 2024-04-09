package com.telran.prof.lesson_4.examplestaticpoly;

import java.util.Arrays;

public class Sum {

    public  int sum (int x, int y) {
        return  x + y;
    }

    public int sum (int x, int y, int z) {
        return (x+y+z);
    }
    public double sum(double x, double y) {
        return x+y;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.println(sum.sum(1, 2));
        System.out.println(sum.sum(1, 2, 3));
        System.out.println(sum.sum(2.0, 1.3));
        Arrays.sort(new int[2]);
    }
}