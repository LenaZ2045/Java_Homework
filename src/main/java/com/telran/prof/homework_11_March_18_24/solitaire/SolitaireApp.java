package com.telran.prof.homework_11_March_18_24.solitaire;

import java.util.*;

public class SolitaireApp {

    public static void main(String[] args) {
        List<Suits> cardSuitList = new ArrayList<>();
        cardSuitList.add(Suits.CLUBS);
        cardSuitList.add(Suits.DIAMONDS);
        cardSuitList.add(Suits.HEARTS);
        cardSuitList.add(Suits.SPADES);

        List<Rank> cardRankList = new ArrayList<>();
        cardRankList.add(Rank.ACE);
        cardRankList.add(Rank.TWO);
        cardRankList.add(Rank.THREE);
        cardRankList.add(Rank.FOUR);
        cardRankList.add(Rank.FIVE);
        cardRankList.add(Rank.SIX);
        cardRankList.add(Rank.SEVEN);
        cardRankList.add(Rank.EIGHT);
        cardRankList.add(Rank.NINE);
        cardRankList.add(Rank.TEN);
        cardRankList.add(Rank.JACK);
        cardRankList.add(Rank.QUEEN);
        cardRankList.add(Rank.KING);

        Stack<Deck> stackDeck = new Stack<>();
        for (Suits suits : cardSuitList) {
            for (Rank ranks : cardRankList) {
                stackDeck.add(new Deck(suits, ranks));
            }
        }

        Collections.shuffle(stackDeck);
        System.out.println();
        System.out.println("Stack list of the cards in the deck = " + stackDeck.size());
        System.out.println(stackDeck);

        System.out.println();
        for (int i = 0; i < stackDeck.size() - 1; i++) {
            Deck currentCard = stackDeck.get(i);
            Deck nextCard = stackDeck.get(i + 1);
            if (currentCard.getSuit().equals(nextCard.getSuit())) {
                for (int j = 0; j < stackDeck.size() - 1; j++) {
                    stackDeck.remove(i + 1);
                }
            } else {
                System.out.println("Error");
            }
        }
        System.out.println();
        System.out.println("Unique stack list of the cards in the deck : ");
        System.out.println(stackDeck);
    }
}