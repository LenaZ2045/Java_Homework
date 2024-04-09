package com.telran.prof.homework_3_Feb_19__24;

import java.util.ArrayList;
import java.util.List;

public class DeliveryStorage extends Storage {

    private List<Product> products = new ArrayList<>();

    public DeliveryStorage(int currentCapacity) {
        super(currentCapacity);
        this.products = getProducts();
    }

    @Override
    public List<Product> getProducts() {
        return super.getProducts();
    }

    @Override
    public void receiveProducts(List<Product> receivedProducts) {
        System.out.println("Received products into Delivery Storage");
        super.receiveProducts(receivedProducts);
    }

    @Override
    public void transferProductsToStorage(List<Product> receivedProducts, Storage targetStorage) {
        System.out.println(receivedProducts);
        System.out.println(targetStorage);
        super.transferProductsToStorage(receivedProducts, targetStorage);
    }

    @Override
    public void loadProduct(Product product) {
        super.loadProduct(product);
    }

    @Override
    public void unloadProduct(Product product) {
        super.unloadProduct(product);
    }

    @Override
    public void printTruckProductList(List<Product> list) {
        System.out.println("Print form Delivery storage");
        super.printTruckProductList(list);
    }

    @Override
    public List<Storage> printProductList(List<Storage> list) {
        return super.printProductList(list);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}