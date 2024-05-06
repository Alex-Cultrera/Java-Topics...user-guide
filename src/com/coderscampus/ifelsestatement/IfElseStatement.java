package com.coderscampus.ifelsestatement;

public class IfElseStatement {

	public static void main(String[] args) {
		
		String y;
		int z = 6;
		
		// The if-else statement is the the traditional format for conditional statements, especially more complex conditions and logic 
		
		if (z >= 5) 
		{
			y = "You win!";
		}
		else {
			y = "You lose!";
		}
		System.out.println(y);
			
			
		// The Conditional Operator or Ternary Operator is an alternative to if-else and useful for simple logic/conditions
		// The Conditional Operator or Ternary Operator is an abbreviated syntax (a one-liner replacement for if-else) >> variable = Condition? Assignment1: Assignment2
		// The code above can be simplified with the Ternary Operator as demonstrated below:
		
		
		y = z>=5? "You win!": "You lose!";
		System.out.println(y);
			

	}

}
