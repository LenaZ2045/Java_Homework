package com.telran.prof.lesson_3.example_interface;

public class ExampleInterface {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Bird bird1 = new Bird();
        String flyname = bird.FLY_NAME;
        String flyname1 = Flyable.FLY_NAME;
        String flyname2 = Bird.FLY_NAME;

        AirPlane airplane = new AirPlane();

        Flyable[] flyables = {bird, bird1, airplane};
        for (Flyable flyable : flyables) {
            // can grouped by interface
            flyable.fly();
        }

        Cat cat = new Cat();
        AbleToEat[] ableToEats = {bird, bird1, cat};
        for (AbleToEat element : ableToEats) {
            element.eat();
        }

        System.out.println(Bird.FLY_NAME); // we call the name over the class name "Bird" - name Bird.name
        System.out.println(Flyable.FLY_NAME); // name field can be called by the interface
        System.out.println(bird); // calling an object
        System.out.println(bird1); // calling an object
    }
}