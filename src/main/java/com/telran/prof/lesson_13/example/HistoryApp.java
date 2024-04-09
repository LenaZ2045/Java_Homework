package com.telran.prof.lesson_13.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistoryApp {

    public static void main(String[] args) {
        Map<User, List<Request>> mapHistory = new HashMap<>();
        List<Request> requestsAlexOne = Arrays.asList(
                new Request("google.com", Status.APPROVED),
                new Request("amazon.com", Status.DECLINED),
                new Request("amazon.net", Status.APPROVED)
        );
        List<Request> requestsAlexTwo = Arrays.asList(
                new Request("google.com", Status.APPROVED),
                new Request("amazon.com", Status.DECLINED),
                new Request("amazon.net", Status.APPROVED)
        );
        User alex = new User("Alex");
        mapHistory.put(alex, requestsAlexOne);
        List<Request> requestsMaxOne = Arrays.asList(
                new Request("google.com", Status.APPROVED),
                new Request("amazon.com", Status.DECLINED),
                new Request("amazon.net", Status.APPROVED)
        );

       List<Request> requestsMaxTwo = Arrays.asList(
                new Request("google.com", Status.APPROVED),
                new Request("amazon.com", Status.DECLINED),
                new Request("amazon.net", Status.APPROVED)
        );
        User max = new User("Maxim");
        mapHistory.put(max, requestsMaxOne);

        Map<User, Map<String, List<Request>>> historyWithDate = new HashMap<>();
        Map<String, List<Request>> alexDateRequestMap = new HashMap<>();
        alexDateRequestMap.put("20240325", requestsAlexOne);
        alexDateRequestMap.put("20240324", requestsAlexTwo);
        historyWithDate.put(alex, alexDateRequestMap);

        Map<String, List<Request>> maxDateRequestMap = new HashMap<>();
        maxDateRequestMap.put("20240323", requestsMaxOne);
        maxDateRequestMap.put("20240322", requestsMaxTwo);
        historyWithDate.put(alex, alexDateRequestMap);

        for(Map.Entry<User, Map<String, List<Request>>> pair : historyWithDate.entrySet()) {
            User key = pair.getKey();
            Map<String, List<Request>> map = pair.getValue();
            for(Map.Entry<String, List<Request>> innerPair : map.entrySet()) {
                String date = innerPair.getKey();
                for (Request request : innerPair.getValue()) {
                    System.out.println(" " + key.getName() + " " + date + " " + request);
                }
            }
        }

        historyWithDate.forEach(((user, mapByDate) -> {
            mapByDate.forEach((date, requests) -> {
                requests.forEach(request ->
                {
                    System.out.println(" " + user.getName() + " " + date + ' ' + requests);
                });
            });
        }));
    }
}
