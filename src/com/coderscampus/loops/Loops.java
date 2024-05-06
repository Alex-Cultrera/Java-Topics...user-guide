package com.coderscampus.loops;

public class Loops {

	public static void main(String[] args) {
		int z;
		z=2;
		
		// indefinite iteration
		WhileLoop wloop = new WhileLoop();
		System.out.println(wloop.getWhile(z));
		
		System.out.println("\n");
		
		// indefinite iteration
		// The do-while loop is very similar to the while loop
		// The major difference is that the do-while loop is guaranteed to execute at least once
		DoWhileLoop dloop = new DoWhileLoop();
		System.out.println(dloop.getDoWhile(z));
		
		System.out.println("\n");
				
		// definite iteration
		// whenever the iterations are known, we can use the for loop
		// this is why it is called a definite loop since the iterations are definite
		// For Loops are one of the most basic and concise looping structures
		// Since the condition is checked at the very beginning before the body of the loop is executed,
		// it is also called the entry control loop
		ForLoop floop = new ForLoop();
		System.out.println(floop.getFor(z));

	}

}
