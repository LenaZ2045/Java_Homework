package com.telran.prof.lesson_11;

import java.util.Stack;

public class TestStackExample {

    public static void main(String[] args) {
// LIFO - last input first output
// FIFO - first input first output
        Stack<String> stack = new Stack<>();
        // push - add element
        // pop - get element and remove
        // peek - get element without remove
        stack.push("I");
        stack.push("am");
        stack.push("student");

        System.out.println(stack);

        //student//
        //am//
        //I//

        System.out.println("is this element is available " + stack.search("student"));

        String peek = stack.peek();
        System.out.println("Top element is : " + stack.peek());
        System.out.println(stack);

        String pop = stack.pop();
        System.out.println("Top element from stack is " + pop);
        System.out.println(stack);
        System.out.println("now top element is " + stack);
    }
}
