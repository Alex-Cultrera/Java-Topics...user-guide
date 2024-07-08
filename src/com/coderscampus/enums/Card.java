package com.coderscampus.enums;

public enum Card {
	ACE(14, 1),
	TWO(2, 2),
	THREE(3, 3),
	FOUR(4, 4),
	FIVE(5, 5),
	SIX(6, 7),
	SEVEN(7, 8),
	EIGHT(8, 9),
	NINE(9, 9),
	TEN(10, 10),
	JACK(11, 10),
	QUEEN(12, 10),
	KING(13, 10);
	
	private Integer cardValue;
	private Integer cardSecondaryValue;
	
	private Card (Integer cardValue, Integer cardSecondaryValue) {
		this.cardValue = cardValue;
		this.cardSecondaryValue = cardSecondaryValue;
	}

	public Integer getCardValue() {
		return cardValue;
	}

	public void setCardValue(Integer cardValue) {
		this.cardValue = cardValue;
	}

	public Integer getCardSecondaryValue() {
		return cardSecondaryValue;
	}

	public void setCardSecondaryValue(Integer cardSecondaryValue) {
		this.cardSecondaryValue = cardSecondaryValue;
	}
}
