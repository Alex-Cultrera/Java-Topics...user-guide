package com.coderscampus.loops;

public class Loops {

	public static void main(String[] args) {
		int z;
		z=2;
		int [] zArray = {6, 75, 3, 16, 22, 90};
		
		// indefinite iteration
		WhileLoop wloop = new WhileLoop();
		System.out.println(wloop.getWhile(z));
		
		System.out.println("\n");
		System.out.println("------------------");
		
		// indefinite iteration
		// The do-while loop is very similar to the while loop
		// The major difference is that the do-while loop is guaranteed to execute at least once
		DoWhileLoop dloop = new DoWhileLoop();
		System.out.println(dloop.getDoWhile(z));
		
		System.out.println("\n");
		System.out.println("------------------");
				
		// definite iteration
		// whenever the iterations are known, we can use the for loop
		// this is why it is called a definite loop since the iterations are definite
		// For Loops are one of the most basic and concise looping structures
		// Since the condition is checked at the very beginning before the body of the loop is executed,
		// it is also called the entry control loop
		ForLoop floop = new ForLoop();
		System.out.println(floop.getFor(z));
		System.out.println("\n");
		System.out.println("------------------");
		
		
		// For-each loop
		// not appropriate when you want to modify the array
		// does not keep track of the index so we cannot obtain array index using for-each
		// only iterates forward over the array in single steps
		// since we do not have a counter variable, we cannot change the traversing flow
		ForEachLoop feloop = new ForEachLoop();
		System.out.println(feloop.getForEach(zArray));
		System.out.println("\n");
		System.out.println("------------------");
		
		

	}

}
