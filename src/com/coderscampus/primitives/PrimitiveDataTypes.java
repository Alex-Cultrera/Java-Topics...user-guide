package com.coderscampus.primitives;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		byte myByte = 4; // (-128 to 127)
		short myShort = 3000; // (+ or - 32 thousand)
		int myInteger = 5; // (+ or - 2 billion)
		long myLong = 78433832498L; // (+ or - 9 quintillion)
		float myFloatingPoint = 5.0f; // (~6 digits precision)
		double myDouble = 5.0d; // (~15 digits precision)
		char myChar = 'a'; // (unicode characters: a 5, ξ, ♪, …)
		boolean myBool = true; // (true/false)
		
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInteger);
		System.out.println(myLong);
		System.out.println(myFloatingPoint);
		System.out.println(myDouble);	
		System.out.println(myChar);	
		System.out.println(myBool);	

	}

}
