package com.coderscampus.multithreading;

public class MultiThreadingExample1 {

	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			SomeTask task = new SomeTask();
			new Thread(task).start();
//			need to start the thread that contains the task
//			once we hit .start it will hit that .run method 
//			because it's a runnable class
		}
	}
	
	static class SomeTask implements Runnable {
		@Override
		public void run() {
			System.out.println("Hey look, I'm at task! " 
					+ "I'm running on thread: " 
					+ Thread.currentThread().getName());
		}
	}
}
//	Note that:
//	1. We used a static class in this example which is not advisable
//	2. This code executes asynchronously 
//	3. For most part, the code you write will be single threaded and/or synchronous
//	4. Computers are naturally multi-threaded because of multiple processes running at once
//	5. a single thread on it's own is a place where computer can do work
//	6. a CPU can only do one thing at any given time, but what happens is 
//		it spreads the load of all the threads (or tasks) across however many processors it has
//		via context switching which means it rapidly switches back and forth between those threads 
//		within span of a second
//	7. you can take advantage of the CPU having multiple processors by writing multi-threaded code
//	8. in essence, multi-threading is all about efficiently running a task