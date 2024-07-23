package com.coderscampus.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingExample7 {

	public static void main(String[] args) {

		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		List<CompletableFuture<Void>> tasks = new ArrayList<>();

		for (int i = 0; i < 20; i++) {
			CompletableFuture<Void> task = CompletableFuture.supplyAsync(() -> new SomeTaskWithExample7(), executor)
							 .thenApply(someTask -> someTask.call()) // .thenApply returns something
							 .thenAccept(dto -> System.out.println(dto)); // .thenAccept does not return anything
			tasks.add(task);
		}

		message = "Done";
		System.out.println(message);
		
		while (tasks.stream()	
					.filter(CompletableFuture::isDone)
					.count() < 20) {
//				this just loops and keeps the main thread alive 
//				until all threads are done working
					}
	}
}
//	1. Future is like a place holder for a value that will eventually get populated
// 	2. CompletableFuture, a static method, became available in version 8 and is a better version of Futures 
//			because of the completion stage which allows us to do call backs (aka promises)
//	3. Call backs, common with JavaScript because JavaScript is a non-blocking language,
//			give us opportunity to do tasks in background and get notified when task gets completed 
//			and executes the function for us when it is complete, without blocking the main thread, 
//			which would render main program inoperable 
//	4. You can use .supplyAsync with or without executor passed in. 
//  5. Without an executor passed in, the .supplyAsync will use default thread pool (aka ForkJoinPool) 
//			which would work fine if running in a web server environment 
//			but here in this example we should pass in an executor
	