package com.telran.prof.homework_3_Feb_19__24;

public class FoodProduct extends Product {

    public FoodProduct(String foodProductName) {
        super(foodProductName);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "FOOD = " + getName();
    }
}