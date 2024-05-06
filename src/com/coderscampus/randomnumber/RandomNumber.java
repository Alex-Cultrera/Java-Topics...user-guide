package com.coderscampus.randomnumber;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random();
		int theRandomNumber = random.nextInt(1, 101); //generates random number inclusive of 1 but not 101
		System.out.println(theRandomNumber);
		
		

	}

}
