package com.coderscampus.enums;

public class EnumApplication {
	public static void main(String[] args) {
		User user = new User("Trevor", "asdfljkl");
		System.out.println(user);
		
		//two different ways to refer to the status below
		
		if("A".equals(user.getStatus().getValue())) {
			System.out.println("User is active");
		}
		
		if("ACTIVE".equals(user.getStatus().name())) {
			System.out.println("User is active");
		}
		
		user.setStatus(Status.INACTIVE);
		System.out.println(user.getStatus());
		
		System.out.println("Ace primary value is: " + Card.ACE.getCardValue());
		System.out.println("Ace secondary value is: " + Card.ACE.getCardSecondaryValue());
		
	}
}
