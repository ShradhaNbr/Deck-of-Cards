package com.deckOfCards;

import java.util.ArrayList;

public class deckOfCards {
	// ArrayList to store the values.
	ArrayList<Cards> cards = new ArrayList<Cards>(52);

	// Store the suits.
	private static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };

	// store the rank of card.
	private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	/*
	 * Purpose: Method to setup the deck with unique cards.
	 */
	private void setupDeck() {
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				this.cards.add(new Cards(suit[i], rank[j]));
			}
		}
	}

	public static void main(String[] args) {

		deckOfCards deckOfCards = new deckOfCards();

		deckOfCards.setupDeck();

	}

}