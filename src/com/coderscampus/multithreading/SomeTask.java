package com.coderscampus.multithreading;

public class SomeTask implements Runnable {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Hey look, I'm a task! I'm running on thread: " + Thread.currentThread().getName());

	}

}
