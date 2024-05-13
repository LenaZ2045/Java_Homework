package com.telran.prof.lesson_22;

public class OnlyNumber <T, U> {

    private T numberOne;
    private U numberTwo;

    public OnlyNumber(T numberOne, U numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void listNum(T numberOne, U numberTwo) {
        System.out.println(numberOne);
        System.out.println(numberTwo);
    }
}