package com.coderscampus.scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		String username;
		String password;
		
		System.out.println("Enter Username:");
		username = scanner.nextLine();
		System.out.println("Enter Password: ");
		password = scanner.nextLine();
			
		System.out.println("Your username is: " + username);
		System.out.println("Your password is: " + password);
		scanner.close();

	}

}
