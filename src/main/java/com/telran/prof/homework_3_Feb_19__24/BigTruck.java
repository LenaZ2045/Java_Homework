package com.telran.prof.homework_3_Feb_19__24;

import java.util.Arrays;

public class BigTruck extends Truck {

    private Product[] products;

    public BigTruck(int capacity) {
        super(capacity);
        this.products = getLoadedProducts();
    }

    @Override
    public Product[] getLoadedProducts() {
        return super.getLoadedProducts();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public boolean unloadTruckProducts(Product product) {
        return super.unloadTruckProducts(product);
    }

    @Override
    public boolean loadTruckProduct(Product product) {
        return super.loadTruckProduct(product);
    }

    @Override
    public void printTruckProducts() {
        System.out.print("BIG truck ");
        super.printTruckProducts();
    }

    @Override
    public String toString() {
        return "BigTruck{" + "products=" + Arrays.toString(products) + '}';
    }
}