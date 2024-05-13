package com.telran.prof.lesson_19.custom;

import java.util.Scanner;

public class ExampleCustom {

    public static void main(String[] args) {

        System.out.println("Please enter book name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        BookShelf bookShelf = new BookShelf();
        try {
            Book book = bookShelf.searchByName(name);
            System.out.println(book);
        } catch (BookNotFoundException | IncorrectBookNameException exception) {
            System.out.println(exception.getMessage());
            System.out.println("Try again");
        }
    }
}