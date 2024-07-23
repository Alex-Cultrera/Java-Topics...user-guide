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
//	Note that:
//	1. We used a static class in this example which is not advisable
//	2. This code executes asynchronously 
	
}
