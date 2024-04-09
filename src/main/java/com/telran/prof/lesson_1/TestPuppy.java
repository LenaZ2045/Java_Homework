package com.telran.prof.lesson_1;

public class TestPuppy {

    public static void main(String[] args) {
        int count = 5; //initialization type of data = prisvoeneie dannih
        String greeting = "Hello!";
        double percent = 10.5;

        Puppy smallPuppy = new Puppy(); // vizvat constructor po ymolchaniyu ssilka na object over the variable "small puppy" = created physically object on the base of Puppy
        String nameSmallPuppy = smallPuppy.name;
        Puppy puppy = new Puppy();
        String namePuppy = puppy.name;
        Puppy middlePuppy = new Puppy();
        String namemiddlePuppy = middlePuppy.name;

        Dog bigDog = new Dog();

        Puppy bigPuppy; // is not creating any object it is only reserving the place
        bigPuppy = new Puppy();

        Puppy namedPuppy = new Puppy("Barsik");
    }

    public static void printAll() {
        //
    }
}