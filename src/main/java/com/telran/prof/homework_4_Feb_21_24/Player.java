package com.telran.prof.homework_4_Feb_21_24;

public class Player {

    private final Card[] cards; // creates array variable for cards

    public Player(int numberOfCards) { // generated constructor
        this.cards = new Card[numberOfCards];
    } // constructor which returns all 52 cads

    public Card[] getCards() { // generated getter
        return cards; // issues list of Card[array]
    }
}