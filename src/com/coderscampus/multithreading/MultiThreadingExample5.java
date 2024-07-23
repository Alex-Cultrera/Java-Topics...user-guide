package com.coderscampus.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingExample5 {

	public static void main(String[] args) {
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());

		ExecutorService service = Executors.newCachedThreadPool();
		
		for (int i=0; i<50; i++) {
			service.execute(new SomeTaskWithExample5());
		}
		
		message = "Done";
		System.out.println(message);
	}
}
//	 1. main difference between fixed thread pool and cached thread pool
//			is that the cached will theoretically continually create new threads 
//			to support whatever	number of threads you need as you are continually 
//			starting up new runnable tasks but as tasks finish, if thread remains 
//			idle for approximately (60 seconds?) then it will shut down that thread,
//			Thus, over long period of time it will balance out to have right number
//			of threads running at any given moment
//	 2.  new cached thread pool not recommended for CPU intensive tasks because it will
//			continually create new threads
//	 3.  Instead, this type of thread pool would likely be a better fit for tasks like 
//			waiting for File to be read (I/O-related), or requests out to internet 
//			and waiting a lot (https-related), because it eliminates the guessing game
//			of thinking about how many threads you may need
//	 4. always a good idea to test it. code synchronously first and then compare to speeds 
// 			when refactored with asynchronous code 
