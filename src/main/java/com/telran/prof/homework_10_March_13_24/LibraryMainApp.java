package com.telran.prof.homework_10_March_13_24;

import com.telran.prof.homework_10_March_13_24.comparator.SortBookByName;
import com.telran.prof.homework_10_March_13_24.comparator.SortBookByYear;
import com.telran.prof.homework_10_March_13_24.comparator.SortByAuthorBirthYear;
import com.telran.prof.homework_10_March_13_24.comparator.SortByPageQuantity;
import com.telran.prof.homework_10_March_13_24.model.Author;
import com.telran.prof.homework_10_March_13_24.model.Book;
import com.telran.prof.homework_10_March_13_24.model.BookShelf;

import java.util.*;

public class LibraryMainApp {

    public static void main(String[] args) {
        Author johnBunyan = new Author("John Bunyan", 1628);
        Author tamaraReznikova = new Author("Tamara Reznikova", 1985);
        Author lewis = new Author("C.S. Lewis", 1898);
        Author johnMilton = new Author("JOhn Milton", 1608);
        Author packer = new Author("J.I. Packer", 1926);
        Author joni = new Author("Joni Eareckson Tada", 1949);
        Author johnPiper = new Author("John Piper", 1946);
        Author macArthur = new Author("John F. MacArthur Jr.", 1939);

        Book book1 = new Book("The Pilgrim's Progress", 1678, 324, johnBunyan); // English & Russian
        Book book2 = new Book("Maja", 2018, 393, tamaraReznikova); // Polish
        Book book3 = new Book("Savage", 2023, 360, tamaraReznikova); // Russian
        Book book4 = new Book("The Problem of Pain", 1940, 176, lewis); // English
        Book book5 = new Book("Paradise Lost & Paradise Regained", 1667, 319, johnMilton); // Russian 1995
        Book book6 = new Book("Knowing God", 1973, 286, packer);
        Book book7 = new Book("Joni: An Unforgettable Story", 1976, 205, joni);
        Book book8 = new Book("Don't Waste Your Life", 2003, 191, johnPiper);
        Book book9 = new Book("Why Believe the Bible?", 2015, 206, macArthur);
        Book book10 = new Book("The Second Coming", 1999, 239, macArthur);

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);
        bookShelf.addBook(book5);
        bookShelf.addBook(book6);
        bookShelf.addBook(book7);
        bookShelf.addBook(book8);
        bookShelf.addBook(book9);
        bookShelf.addBook(book10);

        System.out.println();
        System.out.println("Original List = " + List.of(bookShelf));

        List<Book> bookList = Arrays.asList(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10);

        System.out.println();
        System.out.println("Hello!");
        System.out.println("Enter Book search option either : (byBookName, byBookYear, byBookPageQuantity, byAuthorBirthYear) ");
        Scanner sortOption = new Scanner(System.in);
        String sortRequest = sortOption.nextLine();
        while (!sortRequest.isEmpty()) {
            if (sortRequest.equals("byBookName")) { // I thought if I only wish to show BookName list only
                SortBookByName sortByName = new SortBookByName();
                bookList.sort(sortByName);
                System.out.println("BookSort By Name = " + bookList);
                break;
            }
            if (sortRequest.equals("byBookYear")) {
                SortBookByYear sortByYear = new SortBookByYear();
                bookList.sort(sortByYear);
                System.out.println("BookSort By Year = " + bookList);
                break;
            }
            if (sortRequest.equals("byBookPageQuantity")) {
                SortByPageQuantity sortByPage = new SortByPageQuantity();
                bookList.sort(sortByPage);
                System.out.println("BookSort By Page Count= " + bookList);
                break;
            }
            if (sortRequest.equals("byAuthorBirthYear")) {
                SortByAuthorBirthYear sortByBirth = new SortByAuthorBirthYear();
                bookList.sort(sortByBirth);
                System.out.println("BookSort By Author Birth Year = " + bookList);
                break;
            } // and I thought I need to add else or some test
        }
    }
}