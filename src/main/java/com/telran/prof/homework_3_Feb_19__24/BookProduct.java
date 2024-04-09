package com.telran.prof.homework_3_Feb_19__24;

public class BookProduct extends Product {

    public BookProduct(String bookProductName) {
        super(bookProductName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "BOOK = " + getName();
    }
}