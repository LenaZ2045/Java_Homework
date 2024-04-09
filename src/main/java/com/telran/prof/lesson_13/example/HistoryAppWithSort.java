package com.telran.prof.lesson_13.example;

import java.util.*;

public class HistoryAppWithSort {

    public static void main(String[] args) {

            User alex = new User("Alex");
            List<Request> requestsAlexOne = Arrays.asList(
                    new Request("google.com", Status.APPROVED),
                    new Request("amazon.com", Status.DECLINED),
                    new Request("amazon.de", Status.APPROVED)
            );
            List<Request> requestsAlexTwo = Arrays.asList(
                    new Request("google.com", Status.APPROVED)
            );

            User max = new User("Max");
            List<Request> requestsMaxOne = Arrays.asList(
                    new Request("ebay.com", Status.DECLINED),
                    new Request("amazon.com", Status.APPROVED),
                    new Request("wallmart.com", Status.DECLINED)
            );
            List<Request> requestsMaxTwo = Arrays.asList(
                    new Request("wallmart.com", Status.DECLINED)
            );

        Map<String, Map<User, List<Request>>> mapByDate = new TreeMap<>();
        Map<String, List<Map<User, List<Request>>>> dateRequestMap = new HashMap<>();
        List<Map<User, List<Request>>> list = List.of(Map.of(alex, requestsAlexOne), Map.of(max, requestsMaxOne));
        mapByDate.put("20240325", Map.of(alex, requestsAlexOne));
        mapByDate.put("20240324", Map.of(alex, requestsAlexTwo));

        mapByDate.put("20240323", Map.of(max, requestsMaxOne));
        mapByDate.put("20240322", Map.of(max, requestsMaxTwo));
        }
    }