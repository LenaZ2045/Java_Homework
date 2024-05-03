package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.*;

public class Deck {
    private final Set<CardDeck> deck = new HashSet<>();

    private final Suits suit;

    private final Rank rank;

    public Deck(Suits suits, Rank ranks) {
        this.suit = suits;
        this.rank = ranks;
    }

    public Set<CardDeck> getDeck() {
        return deck;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + ", suit=" + suit + ", rank=" + rank + '}';
    }
}