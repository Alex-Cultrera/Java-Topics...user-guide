package com.coderscampus.multithreading;

public class SomeTaskWithExample2 implements Runnable {

		@Override
		public void run() {
			System.out.println("Hey look, I'm at task! " 
					+ "I'm running on thread: " 
					+ Thread.currentThread().getName());
		}
}

