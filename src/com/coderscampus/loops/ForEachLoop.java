package com.coderscampus.loops;

public class ForEachLoop {

	// Syntax below
	/*
				for(data_type loop_variable : collection) {
					//body of the loop
				}
	*/
	
	// Example below
	
	int i;
	int iArray;
	
	public int getForEach (int[] iArray) {
	
	for(int i : iArray) {
		System.out.println(i);
	}
	
	return i;
	}
	
}
