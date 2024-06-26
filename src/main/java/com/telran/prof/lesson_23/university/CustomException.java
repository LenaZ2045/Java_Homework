package com.telran.prof.lesson_23.university;

public class CustomException extends RuntimeException {

    public boolean getMessage;

    public CustomException(String message) {
        super(message);
    }
}