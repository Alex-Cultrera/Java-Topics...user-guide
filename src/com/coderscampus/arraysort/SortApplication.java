package com.coderscampus.arraysort;

import java.util.Arrays;
import java.util.Comparator;

public class SortApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		
		CelticsPlayer[] players = fileService.getPlayerFromFile();
		
		String[] playerNames = new String[11];
		String[] playerPositions = new String[11];
		Integer[] playerGamesPlayed = new Integer[11];
		
		int i=0;
		System.out.println("---- 2024 Celtics players with over 50 games played: -------");
		
		System.out.println("\n");
		
		for (CelticsPlayer player : players) {
			System.out.println(player.getName() + ", " + player.getPosition() + ", " + player.getGamesPlayed() + " games played");
			playerNames[i] = player.getName();
			playerPositions[i] = player.getPosition();
			playerGamesPlayed[i] = player.getGamesPlayed();
			i++;			
		}
		System.out.println("\n");
		
				
		
		
		System.out.println("---- Now, players sorted by games played: -------");
		Arrays.sort(players, new Comparator<CelticsPlayer>() {

			@Override
			public int compare(CelticsPlayer player1, CelticsPlayer player2) {
				return player1.getGamesPlayed().compareTo(player2.getGamesPlayed());
			}
		}); 
		
		for (CelticsPlayer player : players) {
		System.out.println(player.getName() + ", " + player.getPosition() + ", " + player.getGamesPlayed() + " games played");
		}
			
		}
		

	}


