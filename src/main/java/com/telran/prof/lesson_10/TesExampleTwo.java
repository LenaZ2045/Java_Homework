package com.telran.prof.lesson_10;

public class TesExampleTwo {

    public static void main(String[] args) {
        Cat catOne = new Cat();
        catOne.setName("Delly");
        Cat catTwo = new Cat();
        catTwo.setName("Delly");


        boolean isEqual = catOne == catTwo;
        System.out.println("catOne == catTwo " + isEqual);

        boolean isEquals = catOne.equals(catTwo); // always false BUT when you make (catOne = catTwo this is initialization and t will be TRUE)
        System.out.println("catOne equals catTwo " + isEquals);

        boolean isEqualsTwo = catOne.equals(catTwo);

        System.out.println("catOne equals catTwo? " + isEqualsTwo);

        System.out.println(catOne.equals(null));
    }
}