package com.telran.prof.lesson_22.animalexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalApp {

    public static void main(String[] args) {
        Animal lion = new Animal("LIon");
        System.out.println(lion.getName());
        System.out.println(lion);

        SmallCat catOne = new SmallCat("CatOne");
        SmallCat catTwo = new SmallCat("CatTwo");
        Cat cat = new Cat("CatOriginal");

        SmallDog dogOne = new SmallDog("DogOne");
        Dog dogOriginal = new Dog("DogOriginal");

        List<Animal> animal = new ArrayList<>(Arrays.asList(
                lion , catOne, catOne , cat, dogOne
        ));
        animal.add(dogOriginal);

        List<SmallCat> smallCats = new ArrayList<>(Arrays.asList(
                catOne, catTwo
        ));

        List<Cat> cats = new ArrayList<>(Arrays.asList(cat));

        // add small cat in smallCat list
        addCat(smallCats);
        // add small cat in cats list
        addCat(cats);
        // add small cat in animals list
        addCat(animal);
    }

    private static void addCat(List<? super SmallCat> cats) {
        Cat catThree = new Cat("catThree");
        SmallCat smallCat = new SmallCat("smallCat");
        cats.add(smallCat);
        cats.add(catThree);
        cats.forEach(cat -> System.out.println(cat));
    }
}
