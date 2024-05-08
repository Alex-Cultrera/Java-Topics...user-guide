package com.coderscampus.pojo;

public class UserPOJO {

	//POJO = Plain Old Java Object

	// instance variables (declared as private in this example)
		
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String user;
		
		
	//getters and setters for the above instance variables
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
				
	// Constructor		
	public UserPOJO(String username, String password, String firstName, String lastName, String user) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.user = user;
}

	
		

}
