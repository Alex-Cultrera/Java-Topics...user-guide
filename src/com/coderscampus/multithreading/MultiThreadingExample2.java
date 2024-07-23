package com.coderscampus.multithreading;

public class MultiThreadingExample2 {

	public static void main(String[] args) {
		
		String message = "Starting";
		System.out.println(message);
		System.out.println("Thread-" + Thread.currentThread().getName());
		
		for (int i=0; i<5; i++) {
			SomeTaskWithExample2 task = new SomeTaskWithExample2();
			new Thread(task).start();
		}
		
		message = "Done";
		System.out.println(message);
	}
}
//	Please note:
//	1. There is a difference between asynchronous and multi-threaded
//	2. Some programs can be asynchronous and single-threaded
//	3. Could be hundreds or thousands of threads depending on program
//	4. There are 6 threads at work in this example. They are:
//		1. Thread main
//		2. Thread 0
//		3. Thread 1
//		4. Thread 2
//		5. Thread 3
//		6. Thread 4
