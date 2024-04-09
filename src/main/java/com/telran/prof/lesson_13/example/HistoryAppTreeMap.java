package com.telran.prof.lesson_13.example;

import java.util.Arrays;
import java.util.List;

public class HistoryAppTreeMap {

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

    }}