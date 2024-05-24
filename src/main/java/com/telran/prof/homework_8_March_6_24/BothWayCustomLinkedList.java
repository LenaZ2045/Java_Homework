package com.telran.prof.homework_8_March_6_24;

import java.util.*;

public class BothWayCustomLinkedList implements Iterable<String> {

    private Node<String> head; // field for top of the List
    private Node<String> tail; // field for bottom of the list
    private int size; // field to count size of the list

    private class Node<T> { // we use Node for LinkedLists
        String data; // field we need to store data
        Node<String> next; // field is for connection with the next Node
        Node<String> prev; // field is for connection with previous Node

        Node(String data) { // Node constructor that holds data parameter in it
            this.data = data;
        }
    }

    public void add(String data) { // method to add data in the Node
        Node<String> newNode = new Node<>(data); // creating new Node in Java
        if (head == null) { // logic to check if Node does not contain any data in the head
            head = newNode; // we create new Node in the head
            tail = newNode; // also it is our tail when we input first data
        } else { // otherwise
            tail.next = newNode; // we add new Node at the end of tail
            newNode.prev = tail; // reorganizing that previous data is a tail would move to the right position
            tail = newNode; // and our end Node-tail is data which was entered recently
        }
        size++; // here we calculate the size of each Node we input
    }

    public ListIterator<String> iterator() { // method executes all methods in class CustomLinkedListIterator
        return new CustomLinkedListIterator(); // creates new iterator
    }

    private class CustomLinkedListIterator implements ListIterator<String> {
        private Node<String> current = head; // we use this field to set our current head position

        private Node<String> currentEnd = tail;

        public boolean hasNext() { // method that computes if our Node contains next data
            return current != null; // returns true or false
        }

        public boolean hasPrevious() { // method for previous elements if it is not null
            return currentEnd != null; // returns true or false
        }

        public String next() { // method to move to the next data
            if (!hasNext()) { // logic to inform if Node next data = null
                throw new NoSuchElementException(); // helps to execute the code even no such data
            }
            String data = current.data; // we mark our pointer at head position
            current = current.next; // we define our next pointer position
            return data; // we collect info of the data that is at the current position
        }

        public String previous() { // method to run to the previous data in the list
            if (!hasPrevious()) { // logic to inform if Node previous data = null
                throw new NoSuchElementException(); // helps to run the code even no such data
            }
            String data = currentEnd.data; // we start our pointer at tail position
            currentEnd = currentEnd.prev; // we define our previous position
            return data; // we get data that is at the currentEnd position
        }

        @Override
        public int nextIndex() { // do not use this method
            return 0;
        }

        @Override
        public int previousIndex() { // do not use this method
            return 0;
        }

        @Override
        public void remove() { // do not use this method

        }

        @Override
        public void set(String s) { // do not use this method

        }

        @Override
        public void add(String s) { // do not use this method

        }
    }

    public static void main(String[] args) { // in the main method we execute all code and logics
        BothWayCustomLinkedList list = new BothWayCustomLinkedList(); // create new list for my class
        list.add("one"); // add data
        list.add("two"); // add data
        list.add("three"); // add data


        System.out.println("Forward list view with FOR iteration : "); // run the FOR each iterator
        for (String string : list) { // we take our list and scroll through
            System.out.println(string); // here we print each data we scrolled through
        }

        System.out.println("Forward list view with method iterator : ");
        ListIterator<String> forwardIterator = list.iterator(); // calling out iterator method
        while (forwardIterator.hasNext()) { // and scrolling through list with method hasNext
            System.out.println(forwardIterator.next()); // and printing each next data from list
        }

        System.out.println("Backward list view with method listIterator : ");
        ListIterator<String> reverseIterator = list.listIterator(); // calling listIterator method
        while (reverseIterator.hasPrevious()) { // scrolling through list with method hasPrevious
            System.out.println(reverseIterator.previous()); // printing each previous from list
        }
    }

    private ListIterator<String> listIterator() { // methods executes all methods in class CustomLinkedListIterator
        return new CustomLinkedListIterator(); // creates new list iterator
    }
}