package com.coderscampus.collections;

import java.util.ArrayList;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {
		
		String[] names = new String[4];
		
		names[0] = "Trevor Page";
		names[1] = "Jane Doe";
		names[2] = "John Doe";
		names[3] = "Elon Musk";
		
		names[1] = null;
		
		System.out.println("Arrays Example: ");
		for (String name : names) {
			System.out.println(name);
		}
	
		System.out.println("-----------------");
		
		
		// Collections -> Java solution to common data structure problems
		// List (a type of Collection)
		// Set (a type of Collection)
		// Map (a type of Collection)
		
		//generics allow us to specify the data type that should be used inside our collection
		List<String> elements = new ArrayList<String>();
		
		elements.add("Trevor Page");
		elements.add("John Doe");
		elements.add("Jane Doe");
		elements.add("Elon Musk");
		elements.add("Josh Smith");
		
		System.out.println("List Example: ");
		printArrayListToConsole(elements);
		
		System.out.println("-----------------");
		
		elements.remove(1);
		System.out.println("List Example: ");
		printArrayListToConsole(elements);

		elements.remove("Trevor Page");
		System.out.println("List Example: ");
		printArrayListToConsole(elements);

		 
		
	}

	private static void printArrayListToConsole(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
	}

}

	
