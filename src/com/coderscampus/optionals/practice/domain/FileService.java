package com.coderscampus.optionals.practice.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	String filename;
	String header;
	List<SuspectLocation> mySuspects = new ArrayList<>();
	
	public void updateListOfSuspects(String filename) throws IOException {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((header = reader.readLine()) != null) {
				while ((line = reader.readLine()) != null) {
					String[] lineData = line.split(", ");
					SuspectLocation suspect = new SuspectLocation(lineData [0], lineData[1]);
					mySuspects.add(suspect);
				}
				reader.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
