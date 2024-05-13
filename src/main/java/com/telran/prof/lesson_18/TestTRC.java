package com.telran.prof.lesson_18;

public class TestTRC {

    public static void main(String[] args) {

        // try - catch
        // try - catch - finally(code inside this block always executes)
        // try - finally
        // try - catch - catch .etc
        // try() - catch -with resources (blocks that are shown above)

        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println("Handle exception from catch block");
        } finally { // universal block to clean after executing code even we have mistakes
            System.out.println("Handle and execute code form finally block");
        }
        System.out.println(getInt());
        check(2, 6, 6, 3, 7, 8, 1, 0, 10, 5);
    }

    private static int getInt() {
        try {
            return 5;
        } catch (Exception e) {
            return 10;
        } finally {
            return 15;
        }
    }

    private static void check(int... array) {
        try {
            System.out.println("Get array element = " + array[10]); // calling meaning of the array index
//            System.exit(0); // when adding exit it will end code at this point
            return;
        } catch (Exception e) {
            System.out.println("Handle exception from catch");
            return; // when adding block finally the execution of the block will pass to finally block
        } finally {
            System.out.println("Execution from finally block");
        }
//        System.out.println("End of method");
    }
}