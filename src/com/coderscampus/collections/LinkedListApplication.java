package com.coderscampus.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();
		
		// List is backed by an Array
		// LinkedList is backed by an object called a Node
			//	a Node is an object that has certain properties inside of them:
				//	Head (0 if not at start of list)	Head=1		Head=0		Head=0		Head=0
				//	Tail (0 if not at end of list)		Tail=0	<->	Tail=0	<->	Tail=0	<->	Tail=1
				//	Value It Holds:						(10)		(20)		(30)		(40)
		
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		printListToConsole(numbers);
		
		numbers.remove(0);
		printListToConsole(numbers);
		
		numbers.remove((Integer)30);
		printListToConsole(numbers);
	}
		
	private static void printListToConsole(List<Integer> numbers) {
		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("");
	}

		
}

