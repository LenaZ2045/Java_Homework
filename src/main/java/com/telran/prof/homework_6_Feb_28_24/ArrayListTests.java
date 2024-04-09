package com.telran.prof.homework_6_Feb_28_24;

import java.util.*;

public class ArrayListTests {

    public static void main(String[] args) {
        System.out.println(); // empty line
        int[] arr = new int[5]; // initializing array size or length
        Random random = new Random(); // calling for random numbers in my array
        for (int i = 0; i < arr.length; i++) { // starting cycle by array length
            arr[i] = random.nextInt(20); // creating random numbers in my array between 0-19 range
        }
        System.out.println("Original array list : " + Arrays.toString(arr)); // printing my array of 5 numbers

        List<Integer> doubledArr = new ArrayList<>(); // creating new ArrayList to work with it in List
        for (int val : arr) { // calling for Each number value from array
            int doubledVal = val * 2; // increasing number times * by two 2
            doubledArr.add(doubledVal); // adding increased number to the doubledArr
        }
        System.out.print(doubledArr + " : Is our doubled array list!"); // printing new array with its doubled values

        System.out.println();// empty line
        List<String> string = new ArrayList<>(); // creating new String array
        string.add("Throne"); // added word of 6 letters
        string.add("Storm"); // added word of 5 letters
        string.add("Drop"); // added word of 4 letters
        string.add("Synchronize"); // added word of 11 letters
        string.add("Bil"); // added word of 3 letters

        System.out.println();// empty line
        for (int i = 0; i < string.size(); i++) { // running cycle of the String array size
            System.out.println("Word size '" + string.get(i) + "' by (i : " + i + ") = " + string.get(i).length() + " chars");
            // printing the length of each word of the String array
        }
        ;

        System.out.println();// empty line
        List<Integer> oddNum = new ArrayList<>(); // creating new array list
        for (int num : arr) { // running by "for-each" number in the array
            if (num % 2 != 0) { // sorting number that divides by 2 but is not equal full number
                oddNum.add(num); // adding these numbers to the new oddNum array
            }
        }
        System.out.println("Only odd numbers from our list : " + oddNum); // printing our oddNUm array

        System.out.println();// empty line
        String data = string.toString(); // data is our string list converted in toString
        System.out.println("Original words in the list are : " + data); // printing data list
        char[] stringArr = data.toCharArray(); // converting our data list into CharArray
        Set<Character> uniqueChars = new TreeSet<>(); // creating TreeSet collection list
        for (char letter : stringArr) { // for-each letter we run over our char array
            boolean isUnique = uniqueChars.add(letter); // writing logic to pull out only unique letters
            if (!isUnique) { // takes each letter and compares if it is only one in char array
                uniqueChars.remove(letter); // removes letter that repeats in the char array
            } else {
                uniqueChars.add(letter); // adds letter that is unique to our uniqueChars TreeSet list
            }
        }
        System.out.println("Unique characters of this list are : " + uniqueChars); // prints array list of unique chars

        Set<String> uniqueList = new HashSet<>(); // creating HashSet list
        uniqueList.add("Hello"); // added
        uniqueList.add("Hello"); // present
        uniqueList.add("learn"); // unique
        uniqueList.add("Java"); // added
        uniqueList.add("Java"); // present
        uniqueList.add("Java Pro"); // unique
        System.out.println("Unique HashSet list : " + uniqueList); // prints each added String element once
    }
}

/**
 * METHOD : public boolean add(E e) {
 * return map.put(e, PRESENT)==null;
 * }
 * Removes the specified element from this set if it is present.
 * More formally, removes an element e such that Objects.equals(o, e),
 * if this set contains such an element. Returns true if this set
 * contained the element (or equivalently, if this set changed as a result
 * of the call). (This set will not contain the element once the call returns.)
 * Params:
 * o – object to be removed from this set, if present
 * Returns:
 * true if the set contained the specified element
 */