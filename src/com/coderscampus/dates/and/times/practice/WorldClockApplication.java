package com.coderscampus.dates.and.times.practice;

	import java.time.ZoneId;
	import java.time.ZonedDateTime;
	import java.time.format.DateTimeFormatter;
	import java.time.format.FormatStyle;

	public class WorldClockApplication {
		
		// In this exercise, we are going to be using ZonedDateTime from the java.time package.  Like LocalDate and LocalDateTime,
		// starting from Java 8 onwards, we can easily add in timezones to our date to get the correct time information
		// from different countries.  If you chose your own countries, you may need to do a quick google search on your country
		// zone id.  The format is usually <Continent>/<City>
		
		private final static ZoneId BRISBANE = ZoneId.of("Australia/Brisbane");
		private final static ZoneId DUBLIN = ZoneId.of("Europe/Dublin");
		private final static ZoneId TORONTO = ZoneId.of("America/Toronto");
		private final static ZoneId RIO = ZoneId.of("Brazil/East");

		public static void main(String[] args) {
			
			// first we need to capture what the time is at this exact moment...
			ZonedDateTime zonedDateTime = ZonedDateTime.now();

			// from here you will need to create three system outs to print out the times and dates
			// ZonedDateTime has a method called withZoneSameInstant(<ZoneId>) which gives you the exact date time in the
			// time zone you put in using the zone id.  Try putting in zonedDateTime.withZoneSameInstant(BRISBANE)...
			System.out.println("\nWorld Clock: ");
			System.out.println("Local date & time: " + zonedDateTime);
			System.out.println("Toronto, Canada: " + zonedDateTime.withZoneSameInstant(TORONTO));
			System.out.println("Brisbane, Australia: " + zonedDateTime.withZoneSameInstant(BRISBANE));
			System.out.println("Dublin, Ireland: " + zonedDateTime.withZoneSameInstant(DUBLIN));
			System.out.println("Date/Time in Rio de Janeiro, Brazil: " + zonedDateTime.withZoneSameInstant(RIO));
			
			// after we grabbed the time in our country, we need to format the output using our DateTimeFormatter...
			
			// we need to format it in a way that is easily readable, for this assignment, use FormatStyle.MEDIUM
			
			// ... .format(DateTImeFormatter.ofLocalizedDateTIme(FormatStyle.MEDIUM));
			System.out.println("\nNow, formatted: ");
			System.out.println("Local date & time: " + zonedDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
			System.out.println("Date/Time in Toronto, Canada: " + zonedDateTime.withZoneSameInstant(TORONTO).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
			System.out.println("Date/Time in Brisbane, Australia: " + zonedDateTime.withZoneSameInstant(BRISBANE).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
			System.out.println("Date/Time in Dublin, Ireland: " + zonedDateTime.withZoneSameInstant(DUBLIN).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
			System.out.println("Date/Time in Rio de Janeiro, Brazil: " + zonedDateTime.withZoneSameInstant(RIO).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

			// ... date format should be as follows: yyyy-MM-dd hh:mm a
			System.out.println("\nNow, formatted again: ");
			System.out.println("Local date & time: " + zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
			System.out.println("Date/Time in Toronto, Canada: " + zonedDateTime.withZoneSameInstant(TORONTO).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
			System.out.println("Date/Time in Brisbane, Australia: " + zonedDateTime.withZoneSameInstant(BRISBANE).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
			System.out.println("Date/Time in Dublin, Ireland: " + zonedDateTime.withZoneSameInstant(DUBLIN).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
			System.out.println("Date/Time in Rio de Janeiro, Brazil: " + zonedDateTime.withZoneSameInstant(RIO).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));

	}

}
