package com.telran.prof.homework_4_Feb_21_24;

import java.util.Random;

public class Deck {

    private Card[] deck; // array of the Cards[] object

    public Deck() {
        // empty constructor
    }

    public Card[] getDeck() {
        return deck;
    } // receiving Cards[array] list

    public int numberOfCards() { // multiplication of suits and ranks length gives us number of cards in one deck
        return deck.length;
    } // returns number of cards in one the deck

    public void shuffling() {
        int numberOfCards = Suits.values().length * Rank.values().length; // calculating number of cards in the deck
        Random random = new Random(); // calling Random class to use it to mix cards out of order
        for (int i = 0; i < numberOfCards; i++) { // runs by each card
            int index = i + (random.nextInt(numberOfCards - i)); // shuffles random cards in the deck & decreases deck by one card
            Card temp = deck[index]; // puts card index into temporary deck
            deck[index] = deck[i]; // gets temporary card index & applies it under the 'i' in the cycle
            deck[i] = temp; // releases temporary
        }
    }

    // deck initialization
    public void initialization() { // 13 club cards, 13 diamond cards, 13 heart cards, 13 spades cards (52 total cards in one deck)
//            I need to give each player the initialized but only 5 cards from this deck
        int numberOfCards = Suits.values().length * Rank.values().length; // count number of cards in the deck
        deck = new Card[numberOfCards]; // initialises all cards into the deck
        int index = 0; // starts from zero index
        for (Suits suit : Suits.values()) { // runs over four suits
            for (Rank rank : Rank.values()) { // runs over 13 ranks
                Card card = new Card(suit, rank); // initialises 1 suit to the 1 rank
                deck[index] = card; // marks one card with its suit and rank
                index++; // increases the cycle to the next same operation
            }
        }
    }
}