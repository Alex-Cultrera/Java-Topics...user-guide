package com.coderscampus.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamApplication {

	// Streams are a way to iterate through an entire collection
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		populateNames(names);
		
		System.out.println("Previous way to iterate through list:");
		// previous way to iterate through list
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("\n" + "\n");
		
		System.out.println("Using stream to iterate through list:");
		// using stream to iterate through list
		names.stream()
			 .forEach((String name) -> {
				 System.out.println(name);
			 });
		System.out.println("\n" + "\n");
		
		System.out.println("Now refactoring the previous block of code to make more concise:");
		// to make the above more concise:
		names.stream()
			 .forEach(name -> System.out.println(name));
		System.out.println("\n" + "\n");
		
		System.out.println("Example using multi-threading or \"asynchronous\" operation:");
		// example using multi-threading or "asynchronous" operation
		names.parallelStream()
			 .forEach(name -> System.out.println(name));
		System.out.println("\n" + "\n");
		
		System.out.println("Example without using lambdas, but not as concise as using lambdas:");
		// example without using lambdas, but not as concise as using lambdas:
		names.parallelStream()
			 .forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println(t);
					
				}
			});
		System.out.println("\n" + "\n");
	}
	
			

	private static void populateNames(List<String> names) {
		names.add("Nahla Kirkland");
		names.add("Charly Gay");
		names.add("Jamie-Lee Swan");
		names.add("George Mckeown");
		names.add("Deen Markham");
		names.add("Misha Ali");
		names.add("Tanya James");
		names.add("Taybah Wilkinson");
		names.add("Zac Holman");
		names.add("Kacie Dunlap");
	}
	
	
	
	
	
	

	
	
}
