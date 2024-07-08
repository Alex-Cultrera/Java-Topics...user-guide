package com.coderscampus.optionals.practice.domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FileService {

	String filename;
	String header;
	
	public List<SuspectLocation> generateListOfSuspects(String filename) throws IOException {
		List<SuspectLocation> mySuspects = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((header = reader.readLine()) != null) {
				while ((line = reader.readLine()) != null) {
					String[] lineData = line.split(",");
					SuspectLocation suspect = new SuspectLocation(lineData[0], lineData[1]);
					mySuspects.add(suspect);
				}
				reader.close();
				return mySuspects;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void findCarmen (List<SuspectLocation> listOfSuspects) {
		Optional<SuspectLocation> locationOfCarmen = listOfSuspects.stream()
								.filter(suspect -> suspect.getName().equalsIgnoreCase("Carmen Sandiego"))
								.findAny();
		locationOfCarmen.ifPresentOrElse(suspect -> System.out.println("Carmen Sandiego is in " + suspect.getCountry()), () -> System.out.println("Galdang, just missed her!"));
//		locationOfCarmen.ifPresent(suspect -> System.out.println("Carmen Sandiego is in " + suspect.getCountry()));
	}
	
}
