package com.telran.prof.lesson_16.itemapp;

import java.util.Objects;

public class Item {

    private String title;
    private int price;

    public Item(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(title, item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Item{" + "title='" + title + '\'' + ", price=" + price + '}';
    }
}