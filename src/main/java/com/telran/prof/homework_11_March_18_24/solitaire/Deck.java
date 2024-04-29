package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.*;

public class Deck {

    private Set<CardDeck> deck = new HashSet<>();

    public Deck() {
        // empty constructor
    }

    public void initialization() { // 13 club cards, 13 diamond cards, 13 heart cards, 13 spades cards (52 total cards in one deck)
        for (Suits suit : Suits.values()) { // runs over four suits
            for (Rank rank : Rank.values()) { // runs over 13 ranks
                deck.add(new CardDeck(suit, rank));
            }
        }
    }
    public void shuffling() {
        List<CardDeck> cardDeckList = new ArrayList<>(deck); // convert Set to List
        Collections.shuffle(cardDeckList); // shuffle the list
        deck = new HashSet<>(cardDeckList); // convert back to Set
    }

    public void printUniqueCards() {
        for (CardDeck card : deck) {
            System.out.println(card);
        }
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}