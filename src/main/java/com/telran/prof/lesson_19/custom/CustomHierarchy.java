package com.telran.prof.lesson_19.custom;

public class CustomHierarchy {
    public static void main(String[] args) {
        try {
            one();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void one(){
        two();
    }

    private static void two() {
        three();
    }

    private static void three() {
        throw new BookNotFoundException("CustomHierarchy"); // own exception should be extended from RuntimeException
    }
}