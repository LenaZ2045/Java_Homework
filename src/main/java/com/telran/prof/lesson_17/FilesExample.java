package com.telran.prof.lesson_17;

import java.io.File;
import java.util.Arrays;

public class FilesExample {

    public static void main(String[] args) {
        String pathToFle = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\file.txt";

        // create file as object
        File file = new File(pathToFle);
        // check if it is a directory
        System.out.println("Is a directory? " + file.isDirectory());
        // check if fle exists
        System.out.println("Is file existing? " + file.exists());
        String dirPath = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17\\";

        // create directory
        File dir = new File(dirPath);
        System.out.println("Is directory? " + dir.isDirectory());

        File newDir = new File(dirPath + "/another");
        System.out.println("Is new directory exists? " + newDir.exists());
        // create directory
        boolean mkdir = newDir.mkdir();
        System.out.println("Is new directory exists? " + newDir.exists());

        // delete
        File fileToDelete = new File(pathToFle);
//        boolean delete = fileToDelete.delete();
//        System.out.println("is file deleted? " + delete);

        // list file names
        String pathLesson_17 = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_17";
        File file1 = new File(pathLesson_17);
        String[] list = file1.list();
        System.out.println(Arrays.toString(list));

        // list files
        File[] files = file1.listFiles();
        for (File curFile : files) {
            System.out.println("File name is " + curFile + "; length is " + curFile.length());
        }

    }
}
