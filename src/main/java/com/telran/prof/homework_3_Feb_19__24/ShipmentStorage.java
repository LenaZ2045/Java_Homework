package com.telran.prof.homework_3_Feb_19__24;

import java.util.List;

public class ShipmentStorage extends Storage {

    private List<Product> products;

    public ShipmentStorage(int currentCapacity) {
        super(currentCapacity);
        this.products = getProducts();
    }

    @Override
    public List<Product> getProducts() {
        return super.getProducts();
    }

    @Override
    public void loadProduct(Product product) {
        super.loadProduct(product);
    }

    @Override
    public void unloadProduct(Product product) {
        super.unloadProduct(product);
        System.out.println("Shipment storage is empty");
    }

    @Override
    public List<Storage> printProductList(List<Storage> list) {
        System.out.println("Print from Shipment storage: ");
        return super.printProductList(list);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}