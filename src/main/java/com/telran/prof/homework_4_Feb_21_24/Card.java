package com.telran.prof.homework_4_Feb_21_24;

public class Card {

    private final Suits suit; // enum list of the suits

    private final Rank rank; // enum list of the rank

    public Card(Suits suit, Rank rank) { // constructor which returns suited rank
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() { // print all of our suits and ranks enums
        return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
    }
}