package com.coderscampus.multithreading;

public class MultiThreadingExample3 {
	public static void main(String[] args) {
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());

		for (int i = 0; i < 15; i++) {
			SomeTaskWithExample3 task = new SomeTaskWithExample3();
			new Thread(task).start();
		}

		message = "Done";
		System.out.println(message);
	}
}
//	1. notice that the main thread completes before other threads
//	2. this is in contrast to synchronous coding where the code waits 
//		for task to complete before going to next task (also known as blocking)
//	3. This starts up as many new threads as there are iterations in the for loop
//	    which is not ideal if running CPU heavy tasks
//	4. only want to fire up a ton of threads if those threads are going to be waiting a lot
//		i.e. sending requests across internet, any activities that could involve waiting
//	5. You don't ever want to hit situation where you are maxing out all CPU processing power 
//		on your machine or a server somewhere
	