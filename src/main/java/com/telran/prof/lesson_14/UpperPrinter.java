package com.telran.prof.lesson_14;

public class UpperPrinter implements Printable{
    @Override
    public void print(String text) {
        System.out.println(text.toUpperCase());
    }
}