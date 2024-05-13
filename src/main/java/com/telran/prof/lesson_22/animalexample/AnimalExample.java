package com.telran.prof.lesson_22.animalexample;

import java.util.ArrayList;
import java.util.List;

public class AnimalExample {

    public static void main(String[] args) {
        SmallCat small = new SmallCat("small");

        List<SmallCat> smallCats = new ArrayList<>();
        smallCats.add(small);

        List<Cat> cats = new ArrayList<>();
        cats.add(small);

        List<Animal> animals = new ArrayList<>();
        animals.add(small);

        addCat(smallCats, small);
        addCat(cats, small);
        addCat(animals, small);

        printCat(animals);
        printCat(cats);
    }

    //PECS - Consumer
    // List<SmallCat>, List<Cat>, List<Animal>
    // will accept any type in our list of Classes who is a parent of SmallCat class
    // super SomeClass - SomeClass and all parent class
    private  static void addCat(List<? super SmallCat> list, SmallCat smallCat) { // super acts here as limiter
        list.add(smallCat);
    }

    //List<? extends Object> === List<?>

    //PECS - Producer
    // extends SomeClass - SomeClass and all child class
    private static void printCat(List<? extends Animal> list) { // extends acts here as limiter
        System.out.println(list);
    }

    private static void printAnimal(Animal animal) {
        System.out.println(animal);
    }
}
