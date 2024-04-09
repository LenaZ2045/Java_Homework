package com.telran.prof.lesson_11.customeDeque;

public class CustomDequeApp {

    public static void main(String[] args) {
        MyDeque myDeque = new CustomArrayDeque(16);
        myDeque.addToHead(10);
        //10
        myDeque.addToHead(15);
        //10 15
        myDeque.addToTail(5); // t 5 10 15
        myDeque.addToTail(8); // t 8 5 10 15 prints lke that

        // 8 5 10 15 need to see in console this

        // head = 5;
        // tail = 5;
        // head    tail
        // ---15 10 5 8--// elements saves like that
        // 1 2 4 5 6 7 8

        System.out.println(myDeque);
        System.out.println(myDeque.pollHead());
        System.out.println(myDeque.peekTail());
    }
}