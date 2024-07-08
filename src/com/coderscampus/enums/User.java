package com.coderscampus.enums;

public class User {
	private String username;
	private String password;
	
	private Status status;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
		status = Status.ACTIVE;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", status=" + status + "]";
	}
}
