package com.telran.prof.lesson_14;

public class ExampleFI {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Alex");

        UpperPrinter upperPrinter = new UpperPrinter();
        upperPrinter.print("Steve");

        Printable printable = new Printable() { // created anonymous interface without creating public class
            @Override
            public void print(String text) {
                System.out.println("Hello hello " + text);
            }
        };

        printable.print("Max");

        Printable lowerCasePrinter = text -> System.out.println(text.toLowerCase()); // lambda
        lowerCasePrinter.print("Dorothy");

        CustomPrintable customPrint1 = new CustomPrintable() {
            @Override
            public void printInfo(String text1, String text2) {
                System.out.println("info " + text1 + " add info " + text2);
            }
        };

        CustomPrintable customPrint2 = (string1, string2) -> { // type of data not required here for interface
            System.out.println("info " + string1 + " add info " + string2);
            System.out.println("text1 + " + string1);
            System.out.println("text2 + " + string2);
        };

        customPrint2.printInfo("Students", "Good morning");

        CustomPrintableTwo customPrintableTwo = new CustomPrintableTwo() {
            @Override
            public void print() {
                System.out.println("Hello");
            }
        };

        CustomPrintableTwo customPrintableTwoLambda = () -> System.out.println("Hi!");
    }
}