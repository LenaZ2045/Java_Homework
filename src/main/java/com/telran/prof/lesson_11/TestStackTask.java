package com.telran.prof.lesson_11;

import java.util.Stack;

public class TestStackTask {

    public static void main(String[] args) {
        String test = "addabchffh"; // need to remove double letters
        // first iteration aabchh
        // second iteration bc

        TestStackTask testStackTask = new TestStackTask();
        String result = testStackTask.deleteDuplicate(test);
        System.out.println(result);
    }

    public String deleteDuplicate(String original) { // this method will execute our task to remove double letters
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < original.length(); i++) {
            char temp = original.charAt(i);
            if (stack.isEmpty()) {
                stack.push(temp);
            } else {
                char top = stack.peek();
                if (top == temp) {
                    stack.pop();
                } else {
                    stack.push(temp);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            stringBuilder.append(pop);
        }
        return stringBuilder.reverse().toString(); // added reverse() and it printed alphabetically
    }
}