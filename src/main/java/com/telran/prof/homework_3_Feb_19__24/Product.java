package com.telran.prof.homework_3_Feb_19__24;

public abstract class Product {

    private String name;

    private Product[] products;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + '}';
    }

    public Product[] getProducts() {
        return products;
    }
}