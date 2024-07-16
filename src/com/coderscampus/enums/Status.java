package com.coderscampus.enums;

public enum Status {
	//Enum (enumerated type) is a special type of class or data type
	
		ACTIVE("A", 1),
		INACTIVE("I", 2),
		DELETED("D", 3);
		// all caps is the convention we use to denote constant
		// Enums are a fancy way to store a constant when there is a handful 
		// 		or set number of values or statuses that we are defining 
		
		private String value;
		private int value2;
		
		private Status (String value, int value2) {
			this.value=value;
			this.value2=value2;
		}

		public String getValue() {
			return value;
		}
		public int getValue2() {
			return value2;
		}

		public void setValue(String value) {
			this.value = value;
		}
		public void setValue2(int value2) {
			this.value2 = value2;
		}
}
