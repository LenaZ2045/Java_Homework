package com.telran.prof.lesson_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExampleTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "15", "20", "1", "50", "25", "10");
        System.out.println(list);
        // filter - intermediate, use of filter, true -> go further, false -rejected
        int result = 0;
        for (String element : list) {
            if (element.equals("10")) {
                result++;
            }
        }
        System.out.println(result);

        Predicate<String> filterElement = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "10".equals(s);
            }
        };
        boolean test = filterElement.test("20");

        // count - terminal, count of elements in stream
        long count = list.stream().filter(element -> "10".equals(element) || "20".equals(element)).count();
        System.out.println("Quantity of elements that equals 10 and 20 is " + count);

        long count1 = list.stream().filter(s -> s.equals("20")).count();
        System.out.println("Count of elements equals 20 is " + count1);

        // sorted - intermediate, sort stream
        // forEach - terminal, make action for each element of stream
        list.stream().sorted().forEach(System.out::println);
        System.out.println(list);

        // collect - is a terminal that collects element of stream to new collection
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        List<String> collect = list.stream().filter(s -> s.equals("10")).collect(Collectors.toList());

        // limit, skip - intermediate, lmit - count of elements in stream, skip - skips elements
        List<String> collect1 = list.stream().limit(3).collect(Collectors.toList());
        List<String> collect2 = list.stream().skip(3).collect(Collectors.toList());

        System.out.println("Original list " + list);
        System.out.println("Limited list " + collect1);
        System.out.println("Skipped list " + collect2);

        List<String> sortedAndLimitList = list.stream().sorted().limit(2).collect(Collectors.toList());
        List<String> sortedAndSkippedList = list.stream().sorted().skip(4).collect(Collectors.toList());

        System.out.println("Sorted and limited list " + sortedAndLimitList);
        System.out.println("Sorted and skipped list " + sortedAndSkippedList);

        // distinct - intermediate only unique elements in the stream (analog of forEach)
        List<String> uniqueList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List of unique elements is " + uniqueList);

        // peek - is an intermediate (analog forEach) - make action for each element, but returns stream
        List<String> newList = list.stream().peek(s -> System.out.println(" " + s)).collect(Collectors.toList());

        Consumer<String> stringConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello" + s);
            }
        };
    }

    private static List<String> convertToUpperCase(List<String> strings) {
        List<String> upperCaseList = new ArrayList<>();
        for (String element : strings) {
            upperCaseList.add(element.toUpperCase());
        }
        return upperCaseList;
//        return strings.stream()
//                .map(s -> s.toUpperCase())
//                .filter(s -> s.length() == 10)
//                .filter(s -> s.startsWith("K"))
//                .collect(Collectors.toSet());
    }
}