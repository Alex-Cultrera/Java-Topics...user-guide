package com.coderscampus.multithreading;

import java.util.Random;

public class SomeTaskWithExample3 implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<1000000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1 + int2) * 1.5;
		}
		System.out.println("Hey look, I'm at task! " 
				+ "I'm running on thread: " 
				+ Thread.currentThread().getName());
	}
}
