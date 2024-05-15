package com.coderscampus.arraysort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {

	public CelticsPlayer[] getPlayerFromFile () {
		
		BufferedReader fileReader = null;
		
		try {
			int i = 0;
			String line = null;
			CelticsPlayer[] players = new CelticsPlayer[11];
			fileReader = new BufferedReader(new FileReader("celtics.txt"));
			
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");
				CelticsPlayer player = new CelticsPlayer(lineData[0], lineData[1], lineData[2]);
				players[i] = player;
				i++;				
			}
			return players;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			return null;
		}
		
		
		
	}
	

