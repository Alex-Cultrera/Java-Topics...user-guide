package com.coderscampus.multithreading;

public class MultiThreadingApp {

	public static void main(String[] args) {
		String message = "Starting";
		System.out.println(message);
		
		for (int i = 0; i <5; i++) {
			SomeTask task = new SomeTask();
			new Thread(task).start();
		}

		message = "Done";
		System.out.println(message);
		
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