package com.telran.prof.lesson_10.selfwork;

public class TestSW {

    public static void main(String[] args) {
        Contact contactOne = new Contact("Stars", 15);
        Contact contactTwo = new Contact("Stars", 15);

        Student studentOne = new Student("Alex", 30, contactOne);
        Student studentTwo = new Student("Alex", 30, contactTwo);

        // true
        System.out.println("is equals " + studentOne.equals(studentTwo));

        Contact contactThree = new Contact("Stars", 10);
        Student studentThree = new Student("Alex", 30, contactThree);

        // false
        System.out.println("is equals " + studentOne.equals(studentThree));
    }
}
