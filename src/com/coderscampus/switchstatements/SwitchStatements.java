package com.coderscampus.switchstatements;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		String operator;
		String answer;
		
		Scanner scan;
		scan = new Scanner(System.in);
		System.out.println("Which of these operators (+, -, *, or /) do you want to learn about?");
		operator = scan.nextLine();
		scan.close();
		
		switch (operator) {
		case "+":
			answer = "Addition is " + (num1 + " + " + num2 + " = " + (num1+num2));
			System.out.println(answer);
			break;
		case "-":
			answer = "Subtraction is " + (num1 + " - " + num2 + " = " + (num1-num2));
			System.out.println(answer);
			break;
		case "*":
			answer = "Multiplication is " + (num1 + " * " + num2 + " = " + (num1*num2));
			System.out.println(answer);
			break;
		case "/":
			answer = "Division is " + (num1 + " / " + num2 + " = " + (num1/num2));
			System.out.println(answer);
			break;
		default:
			answer = "Invalid operator";
			System.out.println(answer);
		}
		
			

	}

}
