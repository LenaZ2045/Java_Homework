package com.telran.prof.lesson_16.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeApp {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Victor", "Developer", 2500),
                new Employee("Kim", "CEO", 12500),
                new Employee("Tim", "Developer", 2500),
                new Employee("Scott", "Manager", 3500),
                new Employee("Vicky", "Junior Developer", 2500)
                );

        List<Employee> collect = list.stream()
                .filter(employee -> "Ceo".equals(employee.getPosition()))
                .collect(Collectors.toList());

        System.out.println(collect);

        List<Employee> collect1 = list.stream()
                .filter(employee -> !"Ceo".equals(employee.getPosition()))
                .filter(employee -> !"Manager".equals(employee.getPosition()))
                .collect(Collectors.toList());

        System.out.println(collect1);
    }
}