package com.telran.prof.lesson_18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class ParserExample {

    public static void main(String[] args) {
        String path = "C:\\Users\\bogyp\\Downloads\\demo\\Java_Pro-301023\\src\\main\\java\\com\\telran\\prof\\lesson_18\\Football.txt";

        List<Match> matches = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String[] split = line.split(", ");
                System.out.println(Arrays.toString(split));

                Match match = new Match(new GregorianCalendar(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])), (split[3]), (split[5]), (split[4]), "NULL".equals(split[6]) ? 0 : Integer.parseInt(split[6]), (split[7]));
                matches.add(match);

            }
        } catch (IOException exception) {
            exception.printStackTrace();

        }
    }
}