package com.coderscampus.dates.and.times;

public class DatesApplication {

	public static void main(String[] args) {
		// Pre Java 8 methods for fetching dates and times:
		DatesPreJava8 oldWay = new DatesPreJava8();
		oldWay.lesson6();
		oldWay.lesson7();
		oldWay.lesson8();
		// Post Java 8 methods for fetching dates and times:
		DatesPostJava8 newWay = new DatesPostJava8();
		newWay.lesson9();
		newWay.lesson10();
		newWay.lesson11();
	}

}
