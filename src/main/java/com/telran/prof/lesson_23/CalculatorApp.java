package com.telran.prof.lesson_23;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int add = calculator.add(5, 7);
        int sub = calculator.sub(10, 2);
        System.out.println("Sum " + add);
        System.out.println("Subtraction " + sub);
    }
}