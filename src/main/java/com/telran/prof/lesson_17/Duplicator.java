package com.telran.prof.lesson_17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Duplicator {
    private final String path;

    public Duplicator(String path) {
        this.path = path;
    }
    public void duplicate(String from, String to) {
        try{
            FileInputStream fileInputStream = new FileInputStream(path + "\\" +from);
            FileOutputStream fileOutputStream = new FileOutputStream(path + "\\" +to);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                fileOutputStream.write(data);
            }
            fileInputStream.close();
            fileOutputStream.close();
        }catch (FileNotFoundException exception) {
            System.out.println("Wrong path address. Try again!");
        }catch (IOException exception){
            System.out.println("Access not available. Try again!");
        }
    }
}