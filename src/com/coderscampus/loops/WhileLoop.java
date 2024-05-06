package com.coderscampus.loops;

public class WhileLoop {
	
	int i;
			
	public int getWhile (int i) {
		this.i = i;
		while (i < 9) {
			System.out.println(i);
			i ++;
		}
		return i;
	}

}
