package com.coderscampus.arraysort;

public class CelticsPlayer {

	String name;
	String position;
	String gamesPlayed;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(String gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	public CelticsPlayer(String name, String position, String gamesPlayed) {
		this.name=name;
		this.position=position;
		this.gamesPlayed=gamesPlayed;
	}
	
}
