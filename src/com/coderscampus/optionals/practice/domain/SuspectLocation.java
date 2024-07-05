package com.coderscampus.optionals.practice.domain;

public class SuspectLocation {
	String name;
	String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public SuspectLocation(String name, String country) {
		this.name = name;
		this.country = country;
	}
	
}
