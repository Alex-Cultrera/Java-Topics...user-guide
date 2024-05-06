package com.coderscampus.nonprimitives;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		String myString = "12"; //Strings are a non-prmitive data type
		String myOtherString = "any string"; //Strings are a non-prmitive data type
		
		class Vehicle {  //class is a non-prmitive data type
			int length;
			int msrp;
			String color;
			
		}
		
		Vehicle carObject = new Vehicle(); //objects are a non-prmitive data type
		Vehicle truckObject = new Vehicle(); //objects are a non-prmitive data type
		
		int[] myArray= new int[] {1,2,3}; // arrays are non-primitive data types

		
		System.out.println(myString + " " + myOtherString);
		carObject.length=34;
		carObject.color="blue";
		truckObject.msrp=55000;
		
		System.out.println(carObject.color + " " + carObject.length + " " + truckObject.msrp);
		
		System.out.println(myArray[0]);
		
	}

}
