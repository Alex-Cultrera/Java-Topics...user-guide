package com.coderscampus.multithreading;

import java.util.Random;

public class SomeTaskWithExample4 implements Runnable {
	private static int taskID = 0;
	
	@Override
	public void run() {
		for (int i=0; i<1000000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1 + int2) * 1.5;
		}
		taskID++;
		System.out.println("Hey look, I'm task-id: " + taskID + "! " 
				+ "I'm running on thread: " 
				+ Thread.currentThread().getName());
	}
}
