package com.deckOfCards;

import java.util.ArrayList;

public class deckOfCards {
	String suit[] = { "clubs", "diamonds", "hearts", "spades" };
	String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace" };
	ArrayList<Cards> cards = new ArrayList<Cards>(52);
	public static void main(String[] args) {
	deckOfCards cards = new deckOfCards();
	cards.setCard();
	}

	public void setCard() {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=12;j++) {
				this.cards.add(new Cards (suit[i], rank[j]));
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	}
}
