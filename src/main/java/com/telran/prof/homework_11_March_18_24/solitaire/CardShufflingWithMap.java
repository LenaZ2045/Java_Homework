package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.*;

class Cards {
    private Suits suit;
    private Rank rank;

    public Cards(Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

public class CardShufflingWithMap {
    public static void main(String[] args) {
        Map<Integer, Cards> deck = new HashMap<>();

        // Create the initial deck
        int cardIndex = 0;
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                deck.put(cardIndex++, new Cards(suit, rank));
            }
        }

        // Shuffle the deck (randomize order)
        List<Cards> shuffledDeck = new ArrayList<>(deck.values());
        Collections.shuffle(shuffledDeck);

        // Print shuffled cards
        for (Cards card : shuffledDeck) {
            if (!card.equals(card.hashCode())) {
                System.out.println(card);
            }
        }
    }
}