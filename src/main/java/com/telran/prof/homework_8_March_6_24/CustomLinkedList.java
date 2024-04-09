package com.telran.prof.homework_8_March_6_24;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomLinkedList implements Iterable<Integer>{

    private Node head;
    private int size;

    public Iterator<Integer> iterator() {
        return new CustomLinkedListIterator();
    }

    private class CustomLinkedListIterator implements Iterator<Integer> {

        private Node current = head;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements");
            }
            int value = current.data;
            current = current.next; // есть поле next в классе Node
            return value;
        }
    }

    public int size() {
        return size;
    }

    public void add(int data) { // if method void then we can use return just to exit from method
        // creating new element
        Node newNode = new Node(data, null);
        size++;
        // if LinkedList is empty then we will execute the code below
        if (head == null) {
            head = newNode;
            return;
        }
        // going to the end of LinkedList and setting its link to the next but new element
        // This is to go through the link
        // O(n) - n count of elements
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void addFirst(int data) {
        Node newNode = new Node(data, null);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        // is list is not empty and has elements
        newNode.setNext(head);
        head = newNode;
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

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        size--;
        if (index == 0) {
            // Special case: Removing the head node
            head = head.getNext();
            return;
        }
        Node current = head;
        int count = size;
        // Traverse to the node before the target node
        while (count > 1) {
            current = current.getNext();
            count--;
        }
        // Update references to remove the target node
        Node next = current.getNext();
        current.setNext(next.getNext());
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
}