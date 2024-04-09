package com.telran.prof.homework_4_Feb_21_24;

import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in); // creating new scanner to ask user to enter number of players
        final int cardsForPlayer = 5; // initializing the max number of players can play in one game
        int players = 0; // this variable is for scanner to read number from console that user entered

        Deck deck = new Deck(); // created an object Deck
        deck.initialization(); // calling method from deck object to show us all cards in the deck
        deck.shuffling(); // calling method to shuffle/mix all cards in the deck

        while (true) {
            System.out.println("Enter the number of players: "); // asking user to enter number of players from console

            if (sc.hasNextInt()) { // checking if user entered any value
                players = sc.nextInt(); // initializing how many players are in the game that was entered in console
                if (cardsForPlayer * players <= deck.numberOfCards()) { // logic to check and give 5 cards to each player from the deck
                    break; // ending our session or exiting
                } else {
                    if (players == 0) { // logic to check if entered zero players from console
                        System.out.println("The game has been terminated, because you have 0 players."); // informing of a "0" players msg
                        break; // ending our session or exiting
                    } else if (players < 0) { // logic to check if we have less than zero number that user entered
                        System.out.println("The number of players cannot be less than 0"); // informing of a less '-0'number players msg
                    } else {
                        // informing user if number is greater than allowed (as we may not have enough cards) and starting from while cycle
                        System.out.println("Too many players!");
                    }
                }
            } else {
                // informing user if no number entered or number is greater than allowed (not enough cards for #) & starting from while cycle
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        Player[] ourPlayers = new Player[players]; // creating object of an array with Players  number from console
        int indexDeck = 0; // initializing Deck starting index
        Card[] shuffleDeck = deck.getDeck(); // creating object of an array with shuffled Cards
        for (int i = 0; i < players; i++) { // starting a cycle for number of players entered from console
            Player player = new Player(cardsForPlayer); // creating a Player object that no more than five cards for 1 player
            Card[] cards = player.getCards(); // creating a Card object array which gives 5 shuffled cards to 1 player
            for (int j = 0; j < cardsForPlayer; j++) { // cycle runs in cycle for our card(i) & giving for each player next group of 5 cards
                Card card = shuffleDeck[indexDeck]; // creating card object and initializing to them shuffled 5 cards with index 1
                cards[j] = card; // initializing/giving to first player with index 1 with 5 shuffled cards
                indexDeck++;
                // 0 - 4; 5 - 9 .... after 5 cards, [j] will start from '6' for next player & will add 5 until all players get their 5 cards
            }
            ourPlayers[i] = player; // gives array of cards form cycle [i] for players number entered in console
        }

        // Output
        for (int i = 0; i < players; i++) { // starting cycle here to calculate each next number and initialise it as the player
            for (Player player : ourPlayers) { // going through all of our players
                System.out.println("Cards for this player :"); // informing what type of cards is received
                for (Card card : player.getCards()) { // going through all of our different groups by 5 cards
                    System.out.println(card); // and showing what type of cards each player received
                }
                i++; // increases first operation by one
                System.out.println("Player " + i + " got his cards!"); // informs what number of operation is completed
                System.out.println(); // separating each player with empty line
            }
        }
    }
}