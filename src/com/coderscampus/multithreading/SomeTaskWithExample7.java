package com.coderscampus.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class SomeTaskWithExample7 implements Callable<TaskDto> {
	private static int taskID = 0;
	
	@Override
	public TaskDto call() {
		TaskDto taskDto = new TaskDto();
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
		return taskDto;
	}
}