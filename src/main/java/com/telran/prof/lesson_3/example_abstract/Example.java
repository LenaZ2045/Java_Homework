package com.telran.prof.lesson_3.example_abstract;

public class Example {
    public static void main(String[] args) {
        Dog dog = new Dog("Shari");
        Cow cow = new Cow("Geisha");
        Cow lyuba = new Cow("Lyuba");
        System.out.println(cow.getName()); // returns meaning of the field own name
        System.out.println(lyuba.getName()); // returns meaning condition of the own field name
        Horse horse = new Horse("...");
//        new Animal(); // can not create object of the abstract class

        dog.eat();
        dog.hunts();
        cow.eat();
        cow.produceMilk();
        horse.jump();
        horse.eat();
        horse.born();

        Animal[] animals = {dog, cow, horse}; // put classes-object into array and call out the method for each
        for (Animal animal : animals) {
            animal.eat();
        }
    }
}