package com.telran.prof.homework_9_March_11_24;

import java.util.*;

public class CityGameApp {

    public static void main(String[] args) {
        Set<City> game = new HashSet<>();
        List<City> playerOneCityList = new ArrayList<>();
        List<City> playerTwoCityList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("First player enter your name?");
        String playerOne = scanner.nextLine();
        System.out.println("Second player enter your name?");
        String playerTwo = scanner.nextLine();
        int counter1 = 0;
        int counter2 = 0;
        int city1Counter = 0;
        int city2Counter = 0;


        while (counter1 < 5 || counter2 < 5) {
            System.out.println();
            System.out.print(playerOne + "! Enter name of the city : ");
            String cityName1 = scanner.nextLine();
            City city1 = new City(cityName1);
            playerOneCityList.add(city1);
            if (game.contains(city1)) {
                city1Counter++;
                System.out.println(playerOne + "'s quantity of repeated cities = " + city1Counter);
                counter1++;
                System.out.println(playerOne + "'s number of repetitions = " + counter1);
                if (city1Counter >= 5) {
                    System.out.println(playerOne + "! Game is over! You lost, sorry...");
                    System.out.println(playerTwo + "! Game is over! You won!");
                    break;
                }
            } else {
                game.add(city1);
            }
            System.out.println();
            System.out.print(playerTwo + "! Enter name of the city: ");
            String cityName2 = scanner.nextLine();
            City city2 = new City(cityName2);
            playerTwoCityList.add(city2);
            if (game.contains(city2)) {
                city2Counter++;
                System.out.println(playerTwo + "'s quantity of repeated cities = " + city2Counter);
                counter2++;
                System.out.println(playerTwo + "'s number of repetitions = " + counter2);
                if (city2Counter >= 5) {
                    System.out.println(playerTwo + "! Game is over! You lost, sorry...");
                    System.out.println(playerOne + "! Game is over! You won!");
                    break;
                }
            } else {
                game.add(city2);
            }
        }
        System.out.println();
        System.out.println(playerOne + "'s ist of the cities called : ");
        playerOneCityList.forEach(p1 -> System.out.print(" " + Arrays.asList(p1.getCityName().toUpperCase())));
        System.out.println();
        System.out.println(playerTwo + "'s list of the cities called : ");
        playerTwoCityList.forEach(p2 -> System.out.print(" " + List.of(p2.getCityName().toUpperCase())));
        System.out.println();
        System.out.println("Unique cities both players called : ");
        game.forEach(c -> System.out.print(" " + Collections.singletonList(c.getCityName().toUpperCase())));
    }
}