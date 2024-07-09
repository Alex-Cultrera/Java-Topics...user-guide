package com.coderscampus.dates.and.times;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DatesPreJava8 {

	public void lesson6() {
		Date now = new Date();
		System.out.println(now);
		
		java.sql.Date jan011970 = new java.sql.Date(86400000);
		System.out.println(jan011970);
	}
	
	public void lesson7() {
		// this is deprecated, don't use this method because it is convoluted 
		Date jan012020 = new Date(120, 0, 1, 0, 0, 0);
		System.out.println(jan012020);
		
		// use Calendar instead
		Calendar cal = Calendar.getInstance();
		Date now1 = cal.getTime();
		System.out.println(now1);
		
		cal.set(2020, 0, 1, 15, 1, 5);
		Date someOtherDate = cal.getTime();
		System.out.println(someOtherDate);
		
		cal.add(Calendar.HOUR, 2);
		System.out.println(cal.getTime());
		
		cal.add(Calendar.MINUTE, -1);
		System.out.println(cal.getTime());
		
		Date now = new Date();
		if (now.after(cal.getTime())) {
			System.out.println(now + " is after " + cal.getTime());
		}
	}
	
	public void lesson8() {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
		cal.set(2020, 0, 1);
		Date jan1 = cal.getTime();
		System.out.println(jan1);

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd h:mm:ss");
		formatter.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String formattedDate = formatter.format(jan1);
		System.out.println(formattedDate);
		
		DateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a z");
		formatter2.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		String formattedDate2 = formatter2.format(jan1);
		System.out.println(formattedDate2);
		
		String dateValue1 = "2020-01-05 5:00 PM EST";
		String dateValue2 = "2019-01-01 10:00 AM EST";
		
		DateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd h:mm a z");
		Date date1;
		Date date2;
		try {
			date1 = formatter3.parse(dateValue1);
			date2 = formatter3.parse(dateValue2);
			if (date1.before(date2)) {
				System.out.println("date1 is before date2");
			} else {
				System.out.println("date1 is after date2");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
