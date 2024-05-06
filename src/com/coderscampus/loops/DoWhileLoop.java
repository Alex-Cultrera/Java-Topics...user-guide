package com.coderscampus.loops;

public class DoWhileLoop {
	
	int i;
	
	public int getDoWhile (int i) {
		this.i = i;
		do {
			System.out.println(i);
			i++;
		}
		while (i < 9); //condition
		return i;
	}

}
