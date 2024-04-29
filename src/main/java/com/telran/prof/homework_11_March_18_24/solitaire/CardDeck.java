package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.Objects;

public class CardDeck {

    private final Suits suit;

    private final Rank rank;


    public CardDeck(Suits suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CardDeck uniqueCard = (CardDeck) obj;
        return suit == uniqueCard.suit && rank.equals(uniqueCard.rank); // when I removed RANK I could see only 4 suits
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank); // when I removed RANK I could see only 4 suits...
    }

    @Override
    public String toString() { // print all of our suits and ranks enums
        return "Card{" + "suit=" + suit + ", rank=" + rank + '}';
    }
}
