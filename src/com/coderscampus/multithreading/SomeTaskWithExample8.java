package com.coderscampus.multithreading;

import java.util.Random;

public class SomeTaskWithExample8 {
	private static int taskID = 0;
	private TaskDto taskDto;
	
	public SomeTaskWithExample8 doSomeWork() {
		taskDto = new TaskDto();
		for (int i=0; i<1000000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1 + int2) * 1.5;
			taskDto.setValue(something);
		}
		taskID++;
		System.out.println("Hey look, I'm task-id: " + taskID + "! " 
				+ "I'm running on thread: " 
				+ Thread.currentThread().getName());
		return this;
	}
	
	public TaskDto markComplete () {
		taskDto.setFinished(true);
		return taskDto;
	}
	
}