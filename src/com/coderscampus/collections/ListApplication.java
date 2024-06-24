package com.coderscampus.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Trevor Page");
		names.add("John Doe");
		names.add("Jane Doe");
		names.add("Elon Musk");
		names.add("Josh Smith");
		
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		// example 1 of creating a lambda expression
		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));
		
		// example 2, slightly more "verbose"
		Collections.sort(names, (String o1, String o2) -> o2.compareTo(o1));
		
		// example 3, even more "verbose"
		Collections.sort(names, (String o1, String o2) -> { 
				return o2.compareTo(o1); 
			} 
		);
		
		// example 4, adding even more flavor (note: not same functionality as above due to added null checks)...
		Collections.sort(names, (String o1, String o2) -> { 
				if (o2 != null && o1 != null) {
					return o2.compareTo(o1); 
				} else {
					return 0;
				}
				
			} 
		);
		
		printArrayListToConsole(names);
		
		
		
		
//		example1();

	}

	private static void example1() {
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

	
