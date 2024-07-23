package com.coderscampus.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingExample4 {

	public static void main(String[] args) {
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());

		ExecutorService service = Executors.newFixedThreadPool(3);
//		ExecutorService service2 = Executors.newSingleThreadExecutor();
		
		for (int i=0; i<50; i++) {
			service.execute(new SomeTaskWithExample4());
		}
		
		message = "Done";
		System.out.println(message);
	}
}
//	1. For a CPU bound operation like we have in our "SomeTaskWithExample4" class,
//		we should make use of an ExecutorService to limit the amount of threads used
//  2. The single thread executor is essentially a fixed thread pool with only 1 thread


