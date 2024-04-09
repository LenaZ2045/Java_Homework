package com.telran.prof.homework_3_Feb_19__24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorageProductsApp {

    public static void main(String[] args) {
        Storage shipmentStorage = new ShipmentStorage(0);
        List<Storage> listShip = new ArrayList<>();

        createProductType(listShip, shipmentStorage);
        shipmentStorage.printProductList(listShip);
//        System.out.println("List of products in Storage: " + list); // prints the array list of all products we entered/created

        // Choose truck type
        System.out.println("Enter truck type (if 15 products- type Big, if 10- type Medium, if 5- type Small)");
        Scanner scanner = new Scanner(System.in);
        String truckType = scanner.next();

        // Create truck based on user input
        Truck truck;
        switch (truckType.toLowerCase()) {
            case "big":
                truck = new BigTruck(15);
                break;
            case "medium":
                truck = new MedTruck(10);
                break;
            case "small":
                truck = new SmallTruck(5);
                break;
            default:
                System.out.println("Invalid truck type. Exiting.");
                return;
        }

        // Load truck with products
        for (Product product : shipmentStorage.getProducts()) {
            if (product != null) {
                truck.loadTruckProduct(product);
                System.out.println("Loaded truck with : " + product);
            }
        }

        // Print products in the truck
        truck.printTruckProducts();
        System.out.println("Printing list of cargo in the truck : " + truck);

        // Delivery storage class launch
        List<Product> productList = shipmentStorage.getProducts();
        Storage deliveryStorage = new DeliveryStorage(0);
        deliveryStorage.receiveProducts(productList);
        deliveryStorage.transferProductsToStorage(productList, deliveryStorage);
        deliveryStorage.printTruckProductList(productList);

        // Unload products from the truck
        for (Product productTruck : truck.getLoadedProducts()) {
            truck.unloadTruckProducts(productTruck);
            System.out.println(productTruck);
        }

        // unload products from Shipment storage
        for (Product product : shipmentStorage.getProducts()) {
            if (product != null) {
                shipmentStorage.unloadProduct(product);
                break;
            } else {
                System.out.println("Storage was emptied earlier");
            }
        }
    }

    public static void createProductType(List<Storage> products, Storage shipmentStorage) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the quantity of the products 5, 10, or 15");
        int numProducts = scanner.nextInt();
        Product product = null;
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter type of product BOOK, FOOD, or TECH");
            String productType = scanner.next();
            TypeProducts typeProducts = TypeProducts.valueOf(productType);
            System.out.println("Enter product name ");
            String productName = scanner.next();
            switch (typeProducts) {
                case BOOK:
                    product = new BookProduct(productName);
                    break;
                case FOOD:
                    product = new FoodProduct(productName);
                    break;
                case TECH:
                    product = new TechProduct(productName);
                    break;
            }
            shipmentStorage.loadProduct(product);
        }
        products.add(shipmentStorage);
    }
}