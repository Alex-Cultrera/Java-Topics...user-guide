package com.coderscampus.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;

public class SynchronizedBlocksExample {
	
	private AtomicInteger j = new AtomicInteger(0);
	@Test
	public void example () {
		
		List<CompletableFuture<Integer>> tasks = new ArrayList<>();

//		Synchronized data structure examples:
//		Collections.synchronizedList(myList);
//		ConcurrentMap<String, Integer> myMap = new ConcurrentHashMap<>();
//		Map<String, Integer> myMap = new HashMap<>();
//		
//		synchronized (myMap) {
//			myMap.put("something", 1);
//		}
		
		ExecutorService pool = Executors.newCachedThreadPool();
		for (int i=0; i<10000; i++) {
			CompletableFuture<Integer> task = 
					CompletableFuture.supplyAsync(() -> nowIncrementJ(), pool);
			tasks.add(task);
		}
		
		while(tasks.stream().filter(CompletableFuture::isDone).count() < 10000) {
			System.out.println("Number of completed threads: " 
					+ tasks.stream().filter(CompletableFuture::isDone).count());
		}
		
		outputJ();
	}
	
	private void outputJ() {
		System.out.println(j);
	}
	
	private Integer incrementJ() {
		return j.incrementAndGet();
	}

	private Integer nowIncrementJ() {
		try { Thread.sleep(500); } catch (InterruptedException e) {}
		
//	what we are doing below is essentially saying that 
//		no two threads are aloud to enter this block of code at same time
		synchronized (j) {
			j.set(j.get() + 1);
			return j.get();
		}
	}
}
//	1. a major down side of asynchronous programming is updating and getting 
//		the values of variables in an asynchronous manner causes problems
//	2. in this example we are changing the value of J inside of 10,000 threads
//	3. Integer is not thread safe
//	4. The data needs to be thread safe if you are coding asynchronously 
//		and that data needs to be in a new thread safe block of code, 
//		("a synchronized block") see line 47 above
//	5. The solution is to use a thread safe versions of the variable you are working with
//	6. AtomicInteger is the thread safe version of Integer
//	7. if modifying stuff in a data structure concurrently using multi-threading,
//		make sure whatever data structure being used is thread safe and that 
// 		you are modifying stuff inside of you synchronized block