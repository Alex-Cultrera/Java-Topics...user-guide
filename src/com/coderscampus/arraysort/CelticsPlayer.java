package com.coderscampus.arraysort;

public class CelticsPlayer implements Comparable<CelticsPlayer> {

	String name;
	String position;
	Integer gamesPlayed;
	
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
	public Integer getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	
	public CelticsPlayer(String name, String position, Integer gamesPlayed) {
		this.name=name;
		this.position=position;
		this.gamesPlayed=gamesPlayed;
	}
	
	
	@Override
	public int compareTo(CelticsPlayer that) {
		if (this.gamesPlayed.compareTo(that.gamesPlayed) == 0){
			return this.name.compareTo(that.name); // this will sort names in ascending order
		} else {
			return that.gamesPlayed.compareTo(this.gamesPlayed); 
		} 
	}
	

	
	
}
