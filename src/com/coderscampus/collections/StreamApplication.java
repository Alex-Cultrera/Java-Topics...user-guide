package com.coderscampus.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApplication {

	// Streams are a way to iterate through an entire collection
	
	public static void main(String[] args) {
		
		List<List<Integer>> listOfNumbersList = new ArrayList<>();
		listOfNumbersList.add(Arrays.asList(1,2,3)); 
		listOfNumbersList.add(Arrays.asList(2,3,4)); 
		listOfNumbersList.add(Arrays.asList(3,4,5));
		listOfNumbersList.add(Arrays.asList(4,5,6)); 
		
		IntSummaryStatistics sumStats = listOfNumbersList.stream()
		 						    .flatMap(x -> x.stream())
//						 			.mapToInt(x -> x.intValue())
		 						    .mapToInt(Integer::intValue)
									.summaryStatistics();
						 					
		
		System.out.println("Average: " + sumStats.getAverage());
		System.out.println("Max: " + sumStats.getMax());
		System.out.println("Min: " + sumStats.getMin());
		System.out.println("Count: " + sumStats.getCount());
		
		
		
		
//		example2();
		
//		example1();
				
	}



	private static void example2() {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "F150", 2017));
		cars.add(new Car("Toyota", "Corolla", 1997));
		cars.add(new Car("Toyota", "Celica", 2002));
		
		List<String> models = cars.stream()
								  .map(car -> car.getModel())
								  .collect(Collectors.toList());
		
		String brands = cars.stream()
							.map(car -> car.getBrand())
							.distinct()
							.filter(brand -> brand.startsWith("T"))
							.collect(Collectors.joining(", "));
		
		
		// DON'T DO WHAT YOU SEE BELOW!!! 
		// It's better to use Java 8 Stream as displayed above!!!
		Set<String> carBrands = new HashSet<>();
		for (Car car : cars) {
			String brand = car.getBrand();
			carBrands.add(brand);
			if (brand.startsWith("T")) {
				carBrands.add(brand);
			}
		}
		String output = "";
		for (String carBrand : carBrands) {
//			output = output + carBrand + ", ";
			output += carBrand + ", ";
		}
		output = output.substring(0, output.length()-2);	
		
		models.stream()
			  .forEach(model -> System.out.println(model));
		System.out.println("-----------");
		System.out.println(brands);
		System.out.println("-----------");
		System.out.println(output);
	}



	private static void example1() {
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
