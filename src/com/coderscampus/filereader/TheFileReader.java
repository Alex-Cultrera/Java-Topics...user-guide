package com.coderscampus.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TheFileReader {

	public static void main(String[] args) throws FileNotFoundException {
	
		String fileName = "dataFile";
		
		
		// reading and outputting the contents of the file
		BufferedReader buffReader1 = null;
		try {
			buffReader1 = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = buffReader1.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Closing file reader");
			try {
				buffReader1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		
		// using a while loop to determine the length of the file (how many lines it contains) 
		int totalUsers = 0;
		BufferedReader buffReader2;
		try {
			buffReader2 = new BufferedReader(new FileReader(fileName));
			String userInfo = buffReader2.readLine();
			while (userInfo != null) {
				totalUsers++;
				userInfo = buffReader2.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Oops, the file wasn't found");
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		}		
		
		// the below method could be used along with a User constructor to input contents of file into an array
		/*
		User[] users = new User[totalUsers];
		try (BufferedReader buffReader = new BufferedReader(new FileReader(fileName))) {
			for (int i=0; i<totalUsers; i++) {
				String userInfo = buffReader.readLine();
				String[] userInfoArray = userInfo.split(",");
				users[i] = new User(userInfoArray[0], userInfoArray[1], userInfoArray[2]);
				} 
		} catch (FileNotFoundException e) {
			System.out.println("Oops, the file wasn't found");
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("Oops, there was an I/O Exception");
			e.printStackTrace();
		}
		 */
	}

}
