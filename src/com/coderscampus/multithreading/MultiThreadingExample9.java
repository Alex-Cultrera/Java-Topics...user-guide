package com.coderscampus.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class MultiThreadingExample9 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String message = "Starting\n";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName() + "\n");
		



//		for (int i = 0; i <20; i++) {
//			SomeTask task = new SomeTask();
//			new Thread(task).start();
//		}


		
		ExecutorService service = Executors.newFixedThreadPool(6);
		ExecutorService service2 = Executors.newCachedThreadPool();
		ExecutorService service3 = Executors.newSingleThreadExecutor();
		
		List<CompletableFuture<Void>> tasks = new ArrayList<>();
		
//		This is how you get access to the ForkJoinPool's common pool,
//		which is the default thread pool that's used with CompletableFutures
//		if you do not specify an executor
//		ForkJoinPool commonPool = ForkJoinPool.commonPool();
//		commonPool.
		for (int i = 0; i<20; i++) {
//			Future<TaskDto> futureTask = service3.submit(new SomeTask());
//			System.out.println(futureTask.get());
//			Futures were great prior to Java 8, but now we have something better

//			CompletableFuture.supplyAsync(() -> new SomeTask(), service3)
//			CompletableFuture<Void> task = CompletableFuture.supplyAsync(() -> new SomeTask())
			CompletableFuture.supplyAsync(() -> new SomeTask())
							 .thenApply(someTask -> someTask.call()) // or (someTask::call)
							 .thenAccept(dto -> System.out.println(dto)); // or (System.out::println)
//			tasks.add(task);
//			notifies us when the task is completed.
// 			does not block main thread.
		}
		
		message = "Done";
		System.out.println(message);
		
//		while (tasks.stream()
//					.filter(CompletableFuture::isDone)
//					.count() < 20) {
////			this just loops and keeps the main thread alive
////			until all threads are done working
//			}
	}
	
}
// for most part, the code you write will be single threaded
// meaning it runs on one thread and a thread is where you can do work
// computers are naturally multi-threaded because of multiple processes running at once
// a single thread on it's own is a place where computer can do work
// a CPU can only do one thing at any given time, but what happens is it spreads the load of all the threads (or tasks) across however many processors it has
// via context switching which means it rapidly switches back and forth between those threads within span of a second
// you can take advantage of your CPU having multiple processors by writing multi-threaded code
// in essence, multi-threading is all about efficiently running a task
// Asynchronous Code: 