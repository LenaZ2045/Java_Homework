package com.telran.prof.lesson_18;

public class CustomReaderExample {
    public static void main(String[] args) {
        try (CustomReader reader = new CustomReader()) { // try with resources even critical happens it will execute correctly
            int[] arr = {13, 2, 4};
            System.out.println(arr[5]); // IndexOfBound exception
            System.out.println("Hello!");
        } catch (Exception e) { // catches any mistakes
            System.out.println("Hello from Catch block");
            e.printStackTrace();
        }

//        try { // (in this situation code has not ended its full execution)
//            CustomReader reader = new CustomReader();
//                int[] arr = {13, 2,4};
//                System.out.println(arr[5]); // IndexOfBound exception
//                System.out.println("Hello!");
//                reader.close();
//            }catch (Exception e) {
//                System.out.println("Hello from Catch block");
//                e.printStackTrace();
//            }
//        }
    }
}