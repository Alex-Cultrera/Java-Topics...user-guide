package com.coderscampus.enums;

public enum Status {
	//Enum (enumerated type) is a special type of class or data type
	
		ACTIVE("A"),
		INACTIVE("I"),
		DELETED("D");
		// all caps is the convention we use to denote constant
		// Enums are a fancy way to store a constant when there is a handful 
		// 		or set number of values or statuses that we are defining 
		
		private String value;
		
		private Status (String value) {
			this.value=value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
}
