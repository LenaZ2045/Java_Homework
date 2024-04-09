package com.telran.prof.lesson_13.example;

public class Request {

    private String url;

    private Status status;

    public Request(String url, Status status) {
        this.url = url;
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", status=" + status +
                '}';
    }
}
