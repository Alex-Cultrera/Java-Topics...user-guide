package com.coderscampus.optionals.practice.domain;

import java.io.IOException;

public class SuspectFinderApplication {

	public static void main(String[] args) throws IOException {
		FileService fileService = new FileService();
		String file1 = "InterpolWatchReport-Week1.csv"; 
		String file2 = "InterpolWatchReport-Week2.csv"; 
		String file3 = "InterpolWatchReport-Week3.csv"; 
		System.out.println("Week 1:");
		fileService.findCarmen(fileService.generateListOfSuspects(file1));
		System.out.println("Week 2:");
		fileService.findCarmen(fileService.generateListOfSuspects(file2));
		System.out.println("Week 3:");
		fileService.findCarmen(fileService.generateListOfSuspects(file3));
		
	}
}
