package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.*;
import java.util.stream.Collectors;

class Card {
    private Suits suit;
    private Rank rank;

    public Card(Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

public class CardShuffling {
    public static void main(String[] args) {
        List<Cards> deck = new ArrayList<>();

        // Create the initial deck
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Cards(suit, rank));
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);
        // Yuriy, I tried to use and check out different collections but the result is the same for all
        List<Cards> unique = deck.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
        // Deal cards (print them)
//        for (Cards card : deck) {
//            System.out.println(card);
//        }
    }
}