package com.coderscampus.multithreading;

import java.util.Random;
import java.util.concurrent.Callable;

public class SomeTaskWithExample9 implements Callable<TaskDto> {

	private static int taskId = 0;
	
	

	@Override
	public TaskDto call() {
		TaskDto taskDto = new TaskDto();
		for (int i=0; i<100000; i++) {
			Integer int1 = new Random().nextInt();
			Integer int2 = new Random().nextInt();
			Double something = (int1 + int2) * 1.5;
			taskDto.setValue(something);
		}
		taskId++;
		System.out.println("Hey look, I'm task-id: " + taskId + "!" + "I'm running on thread: " + Thread.currentThread().getName() + "\n");
		taskDto.setFinished(true);
		return taskDto;
		
	}
	
	

}
