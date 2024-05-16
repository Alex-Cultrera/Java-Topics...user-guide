package com.coderscampus.arraysort;

import java.util.Comparator;

public class PlayerComparator implements Comparator<CelticsPlayer>{

	@Override
	public int compare(CelticsPlayer player1, CelticsPlayer player2) {
		return player1.getGamesPlayed().compareTo(player2.getGamesPlayed());
	}

}
