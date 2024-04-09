package com.telran.prof.homework_3_Feb_19__24;

import java.util.List;

public abstract class Storage {

    public int currentCapacity;

    private List<Product> products;

    private Product listProduct;

    public Storage(int currentCapacity) {
        this.currentCapacity = currentCapacity;
        this.products = getProducts();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void receiveProducts(List<Product> receivedProducts) {
        if (receivedProducts != null && !receivedProducts.isEmpty()) {
            products.add(listProduct);
            System.out.println("Loaded " + receivedProducts.size() + " products.");
        } else {
            System.out.println("Received products list is null or empty.");
        }
    }

    public void transferProductsToStorage(List<Product> receivedProducts, Storage targetStorage) {
        targetStorage.receiveProducts(receivedProducts);
        System.out.println("Transferred " + receivedProducts.toString() + " products into " + targetStorage.getClass().getSimpleName() + ".");
    }

    public void loadProduct(Product product) {
        if (currentCapacity < 15) {
            products.add(product);
            currentCapacity++;
            System.out.println("Added item. Current capacity: " + currentCapacity);
        } else {
            System.out.println("Storage is full");
        }
    }

    public void unloadProduct(Product product) {
        System.out.println("Products quantity in the Shipment storage: " + currentCapacity);
        if (!products.isEmpty()) {
            products.remove(product);
            System.out.println("Removed all items");
        } else {
            System.out.println("Storage is empty");
        }
    }

    public List<Storage> printProductList(List<Storage> list) {
        System.out.println("Stock List " + list); // Prints the entire list
        for (Storage storage : list) {
            for (Product product : storage.getProducts()) {
                System.out.println(product + " "); // Print each product
            }
        }
        return list;
    }


    public void printTruckProductList(List<Product> list) {
        System.out.println("Product list >> " + list);
        for (Product delivery : list) {
            System.out.println(delivery + " ");
        }
    }

    @Override
    public String toString() {
        return "Storage{" + "currentCapacity=" + currentCapacity + ", products=" + products + ", listProduct=" + listProduct + '}';
    }
}