package com.telran.prof.lesson_8.custom;

public class CustomLinkedList {

    private Node head;
    private int size;

    public void add(int data) { // if method void then we can use return just to exit from method
        // creating new element
        Node newNode = new Node(data, null);
        size++;
        // if LinkedList is empty then we will execute the code below
        if(head == null) {
            head = newNode;
            return;
        }
        // going to the end of LinkedList and setting its link to the next but new element
        // This is to go through the link
        // O(n) - n count of elements
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void addByIndex(int index, int data) {
        if (index < 1 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        size++;
        // index 0 1 2 3 4
        // data  5 4 6 7 8
        // add by index 2

        // create new element
        Node newNode = new Node(data, null);
        Node current = head;
        int count = 0;
        while (count < index - 1) { // 0 < 1
            current = current.getNext(); // cur = 4
            count++; // 1
        }
        Node next = current.getNext();
        newNode.setNext(next);
        current.setNext(newNode);
    }

    public int size() {
        return size;
    }

    // O(n) time complexity
    public String print() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
//            System.out.print(current.getData() + " ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return print();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        size++;
        if(head == null) {
            head = newNode;
            return;
    }
        // is list is not empty and has elements
        newNode.setNext(head);
        head = newNode;
    }
}