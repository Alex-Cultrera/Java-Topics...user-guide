package com.coderscampus.arraysort;

import java.util.Arrays;

public class SortApplication {

	public static void main(String[] args) {
		FileService fileService = new FileService();
		CelticsPlayer[] players = fileService.getPlayerFromFile();
		
		String[] playerNames = new String[11];
		
		int i=0;
		
		for (CelticsPlayer player : players) {
			System.out.println(player.getName());
			playerNames[i] = player.getName();
			i++;			
		}
		System.out.println("---- Now, player names sorted: -------");
		
		Arrays.sort(playerNames);
		
		for (String playerName : playerNames) {
			
				System.out.println(playerName);
			}
			
	}

}
