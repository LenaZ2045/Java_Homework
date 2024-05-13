package com.telran.prof.lesson_19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExampleSeven {

    public static void main(String[] args) {
        try { // logically it has to work together
            FileReader fileReader = new FileReader("test.txt"); // file NF
            BufferedReader reader = new BufferedReader(fileReader);
            String s = reader.readLine(); // IOException
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { //IOException, FileNotFoundException
            e.printStackTrace();
        } catch (Exception exception) { // Exception, extends Exception
            exception.printStackTrace(); // in some cases in may seem like you do not really understand what is the problem
        }
    }
}