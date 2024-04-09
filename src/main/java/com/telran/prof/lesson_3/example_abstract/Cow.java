package com.telran.prof.lesson_3;

public class Cow extends HomeAnimal {

    public void produceMilk(){
        //
    }

    @Override
    public void born() {

        System.out.println("New baby cow arrived!!!");
    }

    @Override
    void humanCare() {
        System.out.println("Human cares for cows");
    }
}
