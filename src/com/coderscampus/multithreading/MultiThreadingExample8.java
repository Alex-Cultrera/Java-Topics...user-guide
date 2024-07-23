package com.coderscampus.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingExample8 {
	
	public static void main(String[] args) {

		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());
		
//		ExecutorService executor = Executors.newSingleThreadExecutor();
		

		for (int i = 0; i < 20; i++) {
			CompletableFuture.supplyAsync(() -> new SomeTaskWithExample8())
							 .thenApply(someTask -> someTask.doSomeWork()) 
							 .thenApply(someTask -> someTask.markComplete())
							 .thenAccept(dto -> System.out.println(dto)); 
		}

		message = "Done";
		System.out.println(message);
		
	}
}
//	1. The .supplyAsync method which is what you need for a CompletableFuture takes a Supplier
//	2. Supplier just returns an object
//	3. Supplier does not require a Callable or Runnable
// 	4. Supplier only needs you to leverage the functional interface called Supplier
