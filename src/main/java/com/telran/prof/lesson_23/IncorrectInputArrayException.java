package com.telran.prof.lesson_23;

public class IncorrectInputArrayException extends RuntimeException{
    public boolean getMessage;

    public IncorrectInputArrayException(String message) {
        super(message);
    }
}