package com.telran.prof.homework_1_Feb_12_24;

public class PhoneApp {

    public static void main(String[] args) {

        Phone phone1 = new Phone("Samsung", 111, 0.36);
        Phone phone2 = new Phone("Nokia", 222, 0.331);
        Phone phone3 = new Phone("iPhone-13", 333, 0.38375);

        System.out.println("Model " + phone1.getModel() + ", number: " + phone1.getNumber() + ", weight: " + phone1.getWeight() + "/lb");
        System.out.println("Model " + phone2.getModel() + ", number: " + phone2.getNumber() + ", weight: " + phone2.getWeight() + "/lb");
        System.out.println("Model " + phone3.getModel() + ", number: " + phone3.getNumber() + ", weight: " + phone3.getWeight() + "/lb");

        System.out.println(phone1.receiveCall("Joe Zorro") + " from number: " + phone1.getNumber());
        System.out.println(phone1.receiveCall("Vladimir Putin") + " from number: " + phone2.getNumber());
        System.out.println(phone1.receiveCall("Donald Trump") + " from number: " + phone3.getNumber());
    }
}