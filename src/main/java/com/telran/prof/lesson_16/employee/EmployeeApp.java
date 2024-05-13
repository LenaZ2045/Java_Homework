package com.telran.prof.lesson_16.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeApp {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Victor", "Developer", 4500),
                new Employee("Kim", "CEO", 12500),
                new Employee("Tim", "Developer", 5000),
                new Employee("Scott", "Manager", 5500),
                new Employee("Vicky", "Junior Developer", 3000)
        );

        List<Employee> collect = list.stream()
                .filter(employee -> "CEO".equals(employee.getPosition()))
                .collect(Collectors.toList());

        System.out.println("Employee with position 'CEO' is " + collect);

        List<Employee> collect1 = list.stream()
                .filter(employee -> !"CEO".equals(employee.getPosition()))
                .filter(employee -> !"Manager".equals(employee.getPosition()))
                .collect(Collectors.toList());

        System.out.println("Other positions except 'CEO & Manager' are " + collect1);

        Employee employee = list.stream()
                .filter(worker -> !"CEO".equals(worker.getPosition()))
                .filter(worker -> !"Manager".equals(worker.getPosition()))
                .min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .orElse(null);
        System.out.println("The least low earnings as Developer receives an employee " + employee);
    }
}