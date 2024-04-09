package com.telran.prof.lesson_14.basicfuncint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ExampleFunction {
    public static void main(String[] args) {

        // Function interface with method R apply (T, R) ? V apply (T t) takes and returns...
        Function<Integer, Double> halfDivide = a -> a / 2.0; // for double we write 2.0
        Double result = halfDivide.apply(7);
        System.out.println(result);
        System.out.println(halfDivide.apply(9));

        Function<Integer, Double> halfFunc = new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return integer / 2.0;
            }
        };

        List<User> users = Arrays.asList(new User("Alex", "admin"),
                new User("Sali", "member"),
                new User("Bob", "manager"));
        List<String> nameList = process(users, user -> user.getName());
        System.out.println(nameList);

        List<String> roleList = process(users, user -> user.getRole());
        System.out.println(roleList);
    }

    public static List<String> process(List<User> users , Function<User, String> function) {
        List<String> newList = new ArrayList<>();
        for (User user : users) {
            String result = function.apply(user);
            System.out.println(newList.add(function.apply(user)));
        }
        return newList;
    }
}