package com.telran.prof.homework_3_Feb_19__24;

import java.util.Arrays;

public abstract class Truck {

    private Product[] loadedProducts;

    private int count;

    public Truck(int capacity) {
        loadedProducts = new Product[capacity];
        count = 0;
    }

    public Product[] getLoadedProducts() {
        return loadedProducts;
    }

    public int getCount() {
        return count;
    }

    public boolean loadTruckProduct(Product product) {
        if (loadedProducts == null) {
            System.out.println("Error: Product list array is null");
            return false;
        }
        for (int i = 0; i < loadedProducts.length; i++) {
            if (loadedProducts[i] == null) {
                loadedProducts[i] = product;
                count++;
                System.out.println("# " + count + " " + product + " product is loaded at index " + i);
                return true;
            }
        }
        System.out.println("Truck is full. Cannot load product: " + product);
        return false; // Truck is full
    }

    public boolean unloadTruckProducts(Product product) {
        if (loadedProducts == null) {
            System.out.println("Error: loadedProducts list is null.");
            return false;
        }
        if (product == null) {
            System.out.println("Error: product parameter is null.");
            return false;
        }
        for (int i = 0; i < loadedProducts.length; i++) {
            if (product.equals(loadedProducts[i])) {// index-- solve this
                System.out.println(count + "-products in the truck. Unloading " + product + " : at index " + i);
                count--;
                System.out.println("Number products left to unload " + count);
                return true;
            }
        }
        System.out.println("Truck is empty. Cannot unload product: " + product);
        return false;
    }

    public void printTruckProducts() {
        System.out.print("Product list is ");
        for (Product products : loadedProducts) {
            if (products != null) {
                System.out.print(products + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Truck{" + "loadedProducts=" + Arrays.toString(loadedProducts) + ", count=" + count + '}';
    }
}