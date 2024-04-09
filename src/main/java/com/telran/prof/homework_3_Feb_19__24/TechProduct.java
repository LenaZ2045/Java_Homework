package com.telran.prof.homework_3_Feb_19__24;

public class TechProduct extends Product {

    public TechProduct(String techProductName) {
        super(techProductName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "TECH = " + getName();
    }
}