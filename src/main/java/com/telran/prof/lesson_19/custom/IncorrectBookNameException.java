package com.telran.prof.lesson_19.custom;

public class IncorrectBookNameException extends RuntimeException{
    public IncorrectBookNameException(String message) {
        super(message);
    }
}
