package com.telran.prof.lesson_22;

public class OnlyNUmberAoo {

    public static void main(String[] args) {
        OnlyNumber<Integer, Integer> integerOnlyNumber = new OnlyNumber<>(5,5);
        OnlyNumber<Integer, Double> integerDoubleOnlyNumber = new OnlyNumber<>(10, 2.5);
        System.out.println(integerOnlyNumber);
        System.out.println(integerDoubleOnlyNumber);
        integerOnlyNumber.listNum(3,2);
        System.out.println(integerOnlyNumber);
    }
}