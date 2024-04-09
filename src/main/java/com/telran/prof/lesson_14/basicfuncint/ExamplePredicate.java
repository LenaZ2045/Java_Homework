package com.telran.prof.lesson_14.basicfuncint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplePredicate {

    public static void main(String[] args) {

        // Predicate -> boolean test (T t)
        // takes argument and returns parameter 'true' or 'false'

        List<User> users = Arrays.asList(new User("Alex", "admin"),
                new User("Sali", "member"),
                new User("Bob", "manager"));
        Predicate<User> rolePredicate = user -> user.getRole().equals("admin");
        // lambda functional interface
        Predicate<User> rolePredicateInt = new Predicate<User>() { // functional interface
            @Override
            public boolean test(User user) {
                return user.getRole().equals("member");
            }
        };

        for (User user : users) {
            boolean result = rolePredicateInt.test(user);
            if (result) {
                System.out.println(user);
            }
        }

        List<User> admin = process(users, rolePredicate);
        System.out.println(admin);
        List<User> members = process(users, user -> user.getRole().equals("member"));
        System.out.println(members);
    }

    private static List<User> process ( List<User> users,Predicate<User> filter) {
        List<User> newUsers = new ArrayList<>();
        for ( User user : users) {
            if (filter.test(user)) {
                newUsers.add(user);
            }
        }
        return newUsers;
    }
}