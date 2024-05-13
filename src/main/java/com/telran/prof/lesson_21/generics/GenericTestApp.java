package com.telran.prof.lesson_21.generics;

public class GenericTestApp {

    public static void main(String[] args) {
        TestString one = new TestString("Hello");
        String objOne = one.getObj();

        TestInteger two = new TestInteger(5);
        Integer objTwo = two.getObj();

        Test<String> three = new Test<>("Hello");
        String objThree = three.getObj();
        System.out.println(objThree);

        Test<Double> four = new Test<>(3.6);
        Double objFour = four.getObj();
        System.out.println(objFour);

        TestTwo<String, Integer> twoParameters = new TestTwo<>("Java", 20);
        twoParameters.print();
    }
}