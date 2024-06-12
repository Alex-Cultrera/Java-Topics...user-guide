package com.coderscampus.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApplication {
	
	public static void main(String[] args) {
			
		Set<Person> people = new HashSet<>();
		people.add(new Person(1111111, "Trevor", "Page"));
		people.add(new Person(1111111, "Trevor2", "Page2"));
		
		for (Person person : people) {
			System.out.println(person); 
		}
		
		
		Set<Integer> uniqueNumbers = new LinkedHashSet<>();
		
		System.out.println(uniqueNumbers.add(1));
		System.out.println(uniqueNumbers.add(2));
		System.out.println(uniqueNumbers.add(3));
		System.out.println(uniqueNumbers.add(4));
		System.out.println(uniqueNumbers.add(5));
		System.out.println(uniqueNumbers.add(6));
		// you can try to keep adding duplicates but it will not add duplicates to the set
		System.out.println(uniqueNumbers.add(1));
		

		printSetToConsole(uniqueNumbers);
		
		
		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Elon Musk");
		uniqueNames.add("Jane Doe");
		uniqueNames.add("John Doe");
		
		
		// HashSets do not maintain order compared to LinkedHashSets
		for (String element : uniqueNames) {
			System.out.println(element);
		}
		
	}

		
		private static void printSetToConsole(Set<Integer> numbers) {
			for (Integer number : numbers) {
				System.out.println(number);
			}
			System.out.println("");
		}

		
		
}
