package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.*;

public class SolitaireApp {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.initialization();
        deck.shuffling();
        System.out.println();
        // YURIY, the only what gives me unique suits if I put :
//        @Override
//        public int hashCode() {
//            return Objects.hash(suit); // SEE IN CARD-DECK class
//        }
        // with this above it only gives me four suits that are in enum Suit
        //But you are saying that I have to have odd number list nu suits duplicates follow next to suit
        // Show please how this should be done?
        System.out.println("Unique cards in the deck : ");
        deck.printUniqueCards();

        Stack<CardDeck> deckStack = new Stack<>();
        List<CardDeck> cardDeckList = new ArrayList<>(deckStack);
        Collections.shuffle(cardDeckList);
        deckStack = new Stack<>();
        deckStack.addAll(cardDeckList);

        System.out.println();
        Set<Suits> uniqueSet = new HashSet<>();
        for (CardDeck card : deckStack) {
            if (!uniqueSet.contains(card.getSuit())) {
                System.out.println(card);
                uniqueSet.add(card.getSuit());
            }
        }
        System.out.println(uniqueSet.toArray());
    }

    @Override
    public String toString() {
        return "SolitaireApp{}";
    }
}