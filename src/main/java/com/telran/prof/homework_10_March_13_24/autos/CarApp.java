package com.telran.prof.homework_10_March_13_24.autos;

import java.util.*;

public class CarApp {

    public static void main(String[] args) {
        Car audi = new Car("Audi", "white", 11, 22, CarPurpose.SALE);
        Car audiLease = new Car("Audi-TT", "yellow", 77, 88, CarPurpose.LEASE);
        Car prius = new Car("Prius", "silver", 33, 44, CarPurpose.SALE);
        Car priusLease = new Car("Prius-Hatch", "white", 99, 100, CarPurpose.LEASE);
        Car honda = new Car("Honda", "blue", 55, 66, CarPurpose.SALE);
        Car hondaLease = new Car("Honda-Acc", "red", 101, 102, CarPurpose.LEASE);

        System.out.println();
        System.out.println("Audi unique number (" + audi.hashCode() + ")"); // is this unique number you mentioned in the task?
        System.out.println("Prius unique number (" + prius.hashCode() + ")");
        System.out.println("Honda unique number (" + honda.hashCode() + ")");
        System.out.println("Audi-TT unique number (" + audiLease.hashCode() + ")");
        System.out.println("Prius-Hatch unique number (" + priusLease.hashCode() + ")");
        System.out.println("Honda-Acc unique number (" + hondaLease.hashCode() + ")");

        System.out.println();
        List<Car> carList = new ArrayList<>();
        carList.add(audi);
        carList.add(prius);
        carList.add(honda);
        carList.add(audiLease);
        carList.add(priusLease);
        carList.add(hondaLease);
        System.out.println("Dealer's auto list for sale and lease : " + carList);


        System.out.println();
        Set<Car> carHashSet = new HashSet<>();
        carHashSet.add(audiLease);
        carHashSet.add(priusLease);
        carHashSet.add(hondaLease);
        System.out.println("Dealer's auto list for lease : " + carHashSet);

        System.out.println();
        audi.setColor("pearl");
        audi.setCarReg(103);
        audiLease.setColor("orange");
        audiLease.setCarReg(104);
        prius.setColor("grey");
        prius.setCarReg(105);
        priusLease.setColor("creme-white");
        priusLease.setCarReg(106);
        System.out.println("After resale dealer's auto list for SALE and LEASE : " + carList);

        System.out.println();
        for (Car cars : carList) {
            if (carHashSet.contains(cars)) {
                System.out.println("WE FOUND CAR LIST FOR LEASE " + cars);
            } else {
                System.out.println("This vehicles were SOLD " + cars);
            }
        }
    }
}