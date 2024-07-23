package com.coderscampus.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadingExample6 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());

		ExecutorService service = Executors.newCachedThreadPool();
		
		for (int i=0; i<50; i++) {
			Future<TaskDto> futureTask = service.submit(new SomeTaskWithExample6());
			System.out.println(futureTask);
//			System.out.println(futureTask.get());  // <--- This is a blocking call to get method
		}
		
		message = "Done";
		System.out.println(message);
	}
}
//	1. Runnable is a void method so cannot return anything
//	2. As part of the ExecutorService, we were using the .execute method,
//			but we can use a method like .submit instead which takes a Runnable 
//			or a Callable type object
//	3. Futures will show you the values at that precise moment in synchronous manner even though task has 
//			not finished yet, and then when task completes it prints again with the final value
//	4. .get method will allow you to see the future value of the task, but it blocks the main thread,
//		thus it is not asynchronous
//	5. We never want to block the main thread
//		