package com.deckOfCards;

public class Cards {
	private String suit;
	private String rank;

	public Cards(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public void setsuit(String suit) {
		this.suit = suit;
	}

	public String getrank() {
		return rank;
	}

	public void setrank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}

}
