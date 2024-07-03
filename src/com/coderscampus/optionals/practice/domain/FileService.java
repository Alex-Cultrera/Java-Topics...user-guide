package com.coderscampus.optionals.practice.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	String filename;
	
	public List<SuspectLocation> readFiles(String filename) throws IOException {
		List<SuspectLocation> mySuspects = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line;
			String header;
			while ((line = reader.readLine()) != null) {
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
